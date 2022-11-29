package com.example.entitygraph.IService;

import com.example.entitygraph.model.Post;
import com.example.entitygraph.repository.PostRepo;
import com.example.entitygraph.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class IPostService implements PostService {

    @Autowired
    PostRepo postRepo;

    @Override
    public Post findById(Integer id) {
        Optional<Post> post=this.postRepo.findById(id);
        return post.get();

    }

}
