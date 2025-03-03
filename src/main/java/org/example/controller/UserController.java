package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.User;
import org.example.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
@CrossOrigin
@RequiredArgsConstructor

public class UserController {
    final UserService userService;

    @PostMapping("/register-add")

    public void addRegisterforUser(@RequestBody User user){
        userService.register(user);


    }
    @PostMapping("/Login")
    public ResponseEntity<String> addLoging(@RequestBody User loginRequest) {
        try {
            userService.Login(loginRequest.getName(), loginRequest.getPassword());
            return ResponseEntity.ok("Login successful for user: " + loginRequest.getName());
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
