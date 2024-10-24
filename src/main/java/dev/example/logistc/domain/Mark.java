package dev.example.logistc.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import dev.example.logistc.util.EntityIdResolver;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        scope = Mark.class,
        resolver = EntityIdResolver.class,
        property = "id"
)
public class Mark implements ComboListItem{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

}
