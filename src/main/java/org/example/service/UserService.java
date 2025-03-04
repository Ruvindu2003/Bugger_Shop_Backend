package org.example.service;

import org.example.dto.User;

public interface UserService {
    void register(User user);
    boolean validateLogin(String name, String password);
    User getUserDetails(String name);
}