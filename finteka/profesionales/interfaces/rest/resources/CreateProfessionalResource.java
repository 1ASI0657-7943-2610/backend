package backend.finteka.profesionales.interfaces.rest.resources;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record CreateProfessionalResource(

        @NotBlank
        String name,

        String profilePhoto,

        @NotBlank
        String specialty,

        @Email
        String email,

        String highlightInfo

) {}
