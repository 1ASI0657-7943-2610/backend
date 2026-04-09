package backend.finteka.perfil.interfaces.rest.resources;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UpdateProfileResource(

        @Email
        @NotBlank
        String email,

        @NotBlank
        String name,

        String profilePhoto,

        Integer age,

        String specialty,

        String workExperience,

        String district,

        String availability,

        String languages

) {}
