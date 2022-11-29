package com.example.entitygraph.model;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String street;
    private String location;

    @OneToOne(fetch = FetchType.EAGER)
    private User user;
}
