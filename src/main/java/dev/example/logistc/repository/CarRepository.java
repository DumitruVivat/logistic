package dev.example.logistc.repository;

import dev.example.logistc.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
