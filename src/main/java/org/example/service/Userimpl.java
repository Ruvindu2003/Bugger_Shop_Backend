package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dto.User;
import org.example.entity.UserEntity;
import org.example.repository.UserRepository;
import org.modelmapper.ModelMapper;

import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class Userimpl implements UserService{
    final UserRepository userRepository;
    final ModelMapper modelMapper;


    @Override
    public void register(User user) {
      userRepository.save(modelMapper.map(user, UserEntity.class));

    }

    @Override
    public void Login(String name, String password) {
        if (name == null || name.trim().isEmpty() || password == null || password.trim().isEmpty()) {
            throw new IllegalArgumentException("Username and password must not be empty");
        }

        // Fetch user from the database
        UserEntity user = userRepository.findByName(name)
                .orElseThrow(() -> new RuntimeException("User not found"));

        // Check if the password matches
        if (!user.getPassword().equals(password)) {
            throw new RuntimeException("Invalid password");
        }

        // Login successful
        System.out.println("Login successful for user: " + user.getName());
    }
    }




