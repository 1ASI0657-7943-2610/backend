package backend.finteka.profesionales.interfaces.rest.resources;

public record ProfessionalResource(
        Long id,
        String name,
        String profilePhoto,
        String specialty,
        String email,
        String highlightInfo
) {}
