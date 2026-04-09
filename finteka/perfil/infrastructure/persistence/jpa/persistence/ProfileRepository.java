package backend.finteka.perfil.infrastructure.persistence.jpa.repository;

import backend.finteka.perfil.domain.model.aggregates.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
