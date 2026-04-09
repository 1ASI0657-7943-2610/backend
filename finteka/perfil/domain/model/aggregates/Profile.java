package backend.finteka.perfil.domain.model.aggregates;

import backend.finteka.shared.domain.model.aggregates.AuditableAbstractAggregateRoot;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Profile extends AuditableAbstractAggregateRoot<Profile> {

    private String email;
    private String name;
    private String profilePhoto;
    private Integer age;
    private String specialty;
    private String workExperience;
    private String district;
    private String availability;
    private String languages;
}
