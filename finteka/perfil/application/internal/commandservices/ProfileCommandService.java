package backend.finteka.perfil.application.internal.commandservices;

import backend.finteka.perfil.domain.model.aggregates.Profile;
import backend.finteka.perfil.infrastructure.persistence.jpa.repository.ProfileRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileCommandService {

    private final ProfileRepository repository;

    public ProfileCommandService(ProfileRepository repository) {
        this.repository = repository;
    }

    public Profile create(Profile profile) {
        return repository.save(profile);
    }

    public List<Profile> getAll() {
        return repository.findAll();
    }

    public Profile update(Long id, Profile updated) {
        return repository.findById(id)
                .map(p -> {
                    p.setEmail(updated.getEmail());
                    p.setName(updated.getName());
                    p.setProfilePhoto(updated.getProfilePhoto());
                    p.setAge(updated.getAge());
                    p.setSpecialty(updated.getSpecialty());
                    p.setWorkExperience(updated.getWorkExperience());
                    p.setDistrict(updated.getDistrict());
                    p.setAvailability(updated.getAvailability());
                    p.setLanguages(updated.getLanguages());
                    return repository.save(p);
                })
                .orElseThrow(() -> new RuntimeException("Profile not found"));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
