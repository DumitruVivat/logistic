package dev.example.logistc.controller;

import dev.example.logistc.domain.Mark;
import dev.example.logistc.repository.MarkRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mark")
public class MarkRestControllerImpl extends  AbstractRestController<Mark, MarkRepository> {
    public MarkRestControllerImpl(MarkRepository repository) {
        super(repository);
    }
}
