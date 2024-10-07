package com.simpe_Blog.simple_blogging_platform.service;

import com.simpe_Blog.simple_blogging_platform.entity.User;
import com.simpe_Blog.simple_blogging_platform.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);
    }

    public User getUserByUsername(String  username){
        return userRepository.findByUsername(username);
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }


}
