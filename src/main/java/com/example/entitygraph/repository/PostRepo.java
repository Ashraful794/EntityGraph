package com.example.entitygraph.repository;

import com.example.entitygraph.model.Post;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepo extends JpaRepository<Post,Integer> {

    @EntityGraph(value = "post-entity-graph-with-comment-users", type = EntityGraph.EntityGraphType.LOAD)
    Optional<Post> findById(Integer id);


}
