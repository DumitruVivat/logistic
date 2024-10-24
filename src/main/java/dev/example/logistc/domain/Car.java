package dev.example.logistc.domain;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Car implements ComboListItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @ManyToOne
    @JsonIdentityReference
    @JsonSerialize(as=ComboListItem.class)
    private Model model;
}
