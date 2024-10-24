package dev.example.logistc.repository;

import dev.example.logistc.domain.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository <Model, Long> {
}
