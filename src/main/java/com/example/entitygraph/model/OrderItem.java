package com.example.entitygraph.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Version
    private Integer version;

    private Integer quantity;

    @ManyToOne
    private Orders orders;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;
}
