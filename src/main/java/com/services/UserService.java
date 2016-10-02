package com.services;

import com.dto.CreateUserDto;
import com.entities.User;
import com.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User createUser(CreateUserDto createUserDto) {
        User user = new User();
        user.setUsername(createUserDto.getUsername());
        user.setPassword(createUserDto.getPassword());
        return userRepository.save(user);
    }

    public User getUserById(Long userId) {
        return userRepository.findOne(userId);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
