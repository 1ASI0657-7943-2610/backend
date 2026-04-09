package backend.finteka.profesionales.application.internal.commandservices;

import backend.finteka.profesionales.domain.model.aggregates.Professional;
import backend.finteka.profesionales.infrastructure.persistence.jpa.repository.ProfessionalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionalCommandService {

    private final ProfessionalRepository repository;

    public ProfessionalCommandService(ProfessionalRepository repository) {
        this.repository = repository;
    }

    public Professional create(Professional professional) {
        return repository.save(professional);
    }

    public List<Professional> getAll() {
        return repository.findAll();
    }

    public Professional update(Long id, Professional updated) {
        return repository.findById(id)
                .map(p -> {
                    p.setName(updated.getName());
                    p.setProfilePhoto(updated.getProfilePhoto());
                    p.setSpecialty(updated.getSpecialty());
                    p.setEmail(updated.getEmail());
                    p.setHighlightInfo(updated.getHighlightInfo());
                    return repository.save(p);
                })
                .orElseThrow(() -> new RuntimeException("Professional not found"));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
