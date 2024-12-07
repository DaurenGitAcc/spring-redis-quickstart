package com.absat.redis_demo.service;

import com.absat.redis_demo.entity.User;
import com.absat.redis_demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }
    @Cacheable(value = "users", key = "#id")
    public User getUserById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

}
