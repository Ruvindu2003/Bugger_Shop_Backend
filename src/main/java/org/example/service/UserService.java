package org.example.service;

import org.example.dto.User;
import org.example.entity.UserEntity;

public interface UserService {
    void register(User user);
    void Login(String name,String password);

}
