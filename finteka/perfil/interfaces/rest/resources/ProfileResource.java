package backend.finteka.perfil.interfaces.rest.resources;

public record ProfileResource(
        Long id,
        String email,
        String name,
        String profilePhoto,
        Integer age,
        String specialty,
        String workExperience,
        String district,
        String availability,
        String languages
) {}
