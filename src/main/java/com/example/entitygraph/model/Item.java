package com.example.entitygraph.model;
import jakarta.persistence.*;
import lombok.*;

import java.util.*;
@NamedEntityGraph(name = "Item.characteristics",
        attributeNodes = @NamedAttributeNode("characteristics")

)
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "item")
    private List<Characteristic> characteristics = new ArrayList<>();
}
