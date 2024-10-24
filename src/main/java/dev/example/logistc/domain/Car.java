package dev.example.logistc.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import dev.example.logistc.util.EntityIdResolver;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.Banner;

@Entity
@Data
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        scope = Car.class,
        resolver = EntityIdResolver.class,
        property = "id"
)
public class Car implements ComboListItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @ManyToOne
    @JsonIdentityReference(alwaysAsId = true)
    private Model model;
}
