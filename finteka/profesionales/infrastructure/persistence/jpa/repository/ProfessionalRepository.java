package backend.finteka.profesionales.infrastructure.persistence.jpa.repository;

import backend.finteka.profesionales.domain.model.aggregates.Professional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessionalRepository extends JpaRepository<Professional, Long> {
}
