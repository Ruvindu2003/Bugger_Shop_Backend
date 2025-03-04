package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dto.User;
import org.example.entity.UserEntity;
import org.example.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Userimpl implements UserService {
    final UserRepository userRepository;
    final ModelMapper modelMapper;

    @Override
    public void register(User user) {

        UserEntity userEntity = modelMapper.map(user, UserEntity.class);
        userRepository.save(userEntity);
    }

    @Override
    public boolean validateLogin(String name, String password) {

        UserEntity user = userRepository.findByName(name);
        return user != null && user.getPassword().equals(password);
    }

    @Override
    public User getUserDetails(String name) {

        UserEntity user = userRepository.findByName(name);
        if (user == null) {
            return null;
        }
        return modelMapper.map(user, User.class);
    }
}