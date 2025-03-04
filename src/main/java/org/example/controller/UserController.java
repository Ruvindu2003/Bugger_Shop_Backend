package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.User;
import org.example.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {


    final UserService userService;


    @PostMapping("/register")
    public String register(@RequestBody User user) {
        userService.register(user);
        return "User registered successfully!";
    }


    @PostMapping("/login")
    public String login(@RequestParam String name, @RequestParam String password) {
        if (userService.validateLogin(name, password)) {
            return "Login successful!";
        } else {
            return "Invalid credentials!";
        }
    }


    @GetMapping("/details")
    public User getUserDetails(@RequestParam String name) {
        return userService.getUserDetails(name);
    }
}