package backend.finteka.profesionales.domain.model.aggregates;

import backend.finteka.shared.domain.model.aggregates.AuditableAbstractAggregateRoot;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Professional extends AuditableAbstractAggregateRoot<Professional> {

    private String name;
    private String profilePhoto;
    private String specialty;
    private String email;
    private String highlightInfo;
}
