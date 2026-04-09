package backend.finteka.profesionales.interfaces.rest.transform;

import backend.finteka.profesionales.domain.model.aggregates.Professional;
import backend.finteka.profesionales.interfaces.rest.resources.*;

public class ProfessionalMapper {

    public static Professional toEntity(CreateProfessionalResource resource) {
        return Professional.builder()
                .name(resource.name())
                .profilePhoto(resource.profilePhoto())
                .specialty(resource.specialty())
                .email(resource.email())
                .highlightInfo(resource.highlightInfo())
                .build();
    }

    public static Professional toEntity(UpdateProfessionalResource resource) {
        return Professional.builder()
                .name(resource.name())
                .profilePhoto(resource.profilePhoto())
                .specialty(resource.specialty())
                .email(resource.email())
                .highlightInfo(resource.highlightInfo())
                .build();
    }

    public static ProfessionalResource toResource(Professional entity) {
        return new ProfessionalResource(
                entity.getId(),
                entity.getName(),
                entity.getProfilePhoto(),
                entity.getSpecialty(),
                entity.getEmail(),
                entity.getHighlightInfo()
        );
    }
}
