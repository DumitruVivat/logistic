package dev.example.logistc.controller;

import dev.example.logistc.domain.Model;
import dev.example.logistc.repository.ModelRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/model")
public class ModelController extends AbstractRestController<Model, ModelRepository> {
    public ModelController(ModelRepository repo) {
        super(repo);
    }
}
