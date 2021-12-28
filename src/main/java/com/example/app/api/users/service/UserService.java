package com.example.app.api.users.service;

import com.example.app.api.users.domain.entity.Users;
import com.example.app.api.users.domain.repository.UserRepository;
import com.example.app.api.users.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final ModelMapper modelMapper;
    private final UserRepository userRepository;

    public List<UserDTO> getUsers() {
        List<Users> users = userRepository.findAll();

        return users.stream()
                .map(e -> modelMapper.map(e, UserDTO.class))
                .collect(Collectors.toList());
    }
}
