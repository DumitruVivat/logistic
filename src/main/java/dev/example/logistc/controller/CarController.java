package dev.example.logistc.controller;

import dev.example.logistc.domain.Car;
import dev.example.logistc.domain.ComboListItem;
import dev.example.logistc.repository.CarRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/car")
public class CarController extends AbstractRestController<Car, CarRepository> {
    public CarController(CarRepository repo) {
        super(repo);
    }
}
