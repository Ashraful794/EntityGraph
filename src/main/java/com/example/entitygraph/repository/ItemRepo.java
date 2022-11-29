package com.example.entitygraph.repository;

import com.example.entitygraph.model.Item;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepo extends JpaRepository<Item,Integer> {
    @EntityGraph(value = "Item.characteristics",type = EntityGraph.EntityGraphType.LOAD)
    Item findByName(String name);

}
