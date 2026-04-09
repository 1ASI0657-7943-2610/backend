package backend.finteka.profesionales.interfaces.rest;

import backend.finteka.profesionales.application.internal.commandservices.ProfessionalCommandService;
import backend.finteka.profesionales.interfaces.rest.resources.*;
import backend.finteka.profesionales.interfaces.rest.transform.ProfessionalMapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/professionals")
@Tag(name = "Profesionales", description = "CRUD de profesionales")
public class ProfessionalController {

    private final ProfessionalCommandService service;

    public ProfessionalController(ProfessionalCommandService service) {
        this.service = service;
    }

    @PostMapping
    public ProfessionalResource create(@RequestBody CreateProfessionalResource resource) {
        var entity = ProfessionalMapper.toEntity(resource);
        return ProfessionalMapper.toResource(service.create(entity));
    }

    @GetMapping
    public List<ProfessionalResource> getAll() {
        return service.getAll()
                .stream()
                .map(ProfessionalMapper::toResource)
                .toList();
    }

    @PutMapping("/{id}")
    public ProfessionalResource update(@PathVariable Long id,
                                       @RequestBody UpdateProfessionalResource resource) {
        var entity = ProfessionalMapper.toEntity(resource);
        return ProfessionalMapper.toResource(service.update(id, entity));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
