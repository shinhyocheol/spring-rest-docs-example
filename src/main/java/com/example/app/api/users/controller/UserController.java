package com.example.app.api.users.controller;

import com.example.app.api.users.dto.UserDTO;
import com.example.app.api.users.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping(value = "")
    public ResponseEntity<List<UserDTO>> getUsers() {

        return ResponseEntity.ok()
                .body(userService.getUsers());
    }

}
