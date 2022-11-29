package com.example.entitygraph.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@NamedEntityGraph(name = "graph.Orders.items",
        attributeNodes = @NamedAttributeNode("items"))
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Version
    private Integer version;

    private String orderNumber;

    @OneToMany(mappedBy = "orders", fetch = FetchType.LAZY)
    private Set<OrderItem> items = new HashSet<OrderItem>();
}
