package com.thoughtpay.services;

import com.thoughtpay.domain.User;
import com.thoughtpay.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void update(User user) {
        userRepository.update(user);
    }

    public void saveNewUser(User newUser) {
        userRepository.save(newUser);
    }

    public User getUser(String id) { return userRepository.getById(id);}
}


