package backend.finteka.perfil.interfaces.rest.transform;

import backend.finteka.perfil.domain.model.aggregates.Profile;
import backend.finteka.perfil.interfaces.rest.resources.*;

public class ProfileMapper {

    public static Profile toEntity(CreateProfileResource resource) {
        return Profile.builder()
                .email(resource.email())
                .name(resource.name())
                .profilePhoto(resource.profilePhoto())
                .age(resource.age())
                .specialty(resource.specialty())
                .workExperience(resource.workExperience())
                .district(resource.district())
                .availability(resource.availability())
                .languages(resource.languages())
                .build();
    }

    public static Profile toEntity(UpdateProfileResource resource) {
        return Profile.builder()
                .email(resource.email())
                .name(resource.name())
                .profilePhoto(resource.profilePhoto())
                .age(resource.age())
                .specialty(resource.specialty())
                .workExperience(resource.workExperience())
                .district(resource.district())
                .availability(resource.availability())
                .languages(resource.languages())
                .build();
    }

    public static ProfileResource toResource(Profile entity) {
        return new ProfileResource(
                entity.getId(),
                entity.getEmail(),
                entity.getName(),
                entity.getProfilePhoto(),
                entity.getAge(),
                entity.getSpecialty(),
                entity.getWorkExperience(),
                entity.getDistrict(),
                entity.getAvailability(),
                entity.getLanguages()
        );
    }
}
