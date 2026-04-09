package backend.finteka.perfil.interfaces.rest;

import backend.finteka.perfil.application.internal.commandservices.ProfileCommandService;
import backend.finteka.perfil.interfaces.rest.resources.*;
import backend.finteka.perfil.interfaces.rest.transform.ProfileMapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profiles")
@Tag(name = "Perfil", description = "CRUD de perfiles de usuario")
public class ProfileController {

    private final ProfileCommandService service;

    public ProfileController(ProfileCommandService service) {
        this.service = service;
    }

    @PostMapping
    public ProfileResource create(@RequestBody CreateProfileResource resource) {
        var entity = ProfileMapper.toEntity(resource);
        return ProfileMapper.toResource(service.create(entity));
    }

    @GetMapping
    public List<ProfileResource> getAll() {
        return service.getAll()
                .stream()
                .map(ProfileMapper::toResource)
                .toList();
    }

    @PutMapping("/{id}")
    public ProfileResource update(@PathVariable Long id,
                                  @RequestBody UpdateProfileResource resource) {
        var entity = ProfileMapper.toEntity(resource);
        return ProfileMapper.toResource(service.update(id, entity));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
