package com.example.entitygraph.controller;

import com.example.entitygraph.repository.PostRepo;
import com.example.entitygraph.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @Autowired
    PostService postService;


    @GetMapping("/post/{id}")
    public ResponseEntity getPost(@PathVariable Integer id)
    {
        return ResponseEntity.ok(this.postService.findById(id));
    }
}
