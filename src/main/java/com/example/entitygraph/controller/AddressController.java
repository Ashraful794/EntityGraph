package com.example.entitygraph.controller;

import com.example.entitygraph.repository.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    AddressRepo addressRepo;

    @GetMapping("/address/{id}")
    public ResponseEntity getAddress(@PathVariable Integer id)
    {
        return ResponseEntity.ok(this.addressRepo.findById(id));
    }
}
