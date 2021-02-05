package com.example.HelloSpring.Controller;


import com.example.HelloSpring.Model.User;
import com.example.HelloSpring.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController{

    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    private List<User> findAll(){
        return (List<User>) userRepository.findAll();
    }

    @PostMapping("/register")
    private String register(@RequestBody final User user){
            return userRepository.save(user).toString();
    }
}
