package com.example.app.api.posts.controller;

import com.example.app.api.posts.dto.PostsDto;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RequestMapping(value = {"/posts"}, produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class PostsController {

    @GetMapping(value = "")
    public ResponseEntity<List<PostsDto>> getPosts() {

        List<PostsDto> response = Arrays.asList(
                new PostsDto((long)1, "TEST TITLE(1)", "TEST CONTENT(1)", "TEST AUTHOR(1)"),
                new PostsDto((long)1, "TEST TITLE(2)", "TEST CONTENT(2)", "TEST AUTHOR(2)"),
                new PostsDto((long)1, "TEST TITLE(3)", "TEST CONTENT(3)", "TEST AUTHOR(3)"),
                new PostsDto((long)1, "TEST TITLE(4)", "TEST CONTENT(4)", "TEST AUTHOR(4)")
        );

        return ResponseEntity.ok()
                .body(response);
    }

}
