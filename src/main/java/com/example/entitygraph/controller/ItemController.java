package com.example.entitygraph.controller;

import com.example.entitygraph.repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @Autowired
    ItemRepo itemRepo;

    @GetMapping("/items/{name}")
    public ResponseEntity getItem(@PathVariable String name)
    {
        return ResponseEntity.ok(this.itemRepo.findByName(name));
    }
}
