package com.apitest.demo.api.controller;

import com.apitest.demo.api.model.User;
import com.apitest.demo.service.UserService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;
import java.util.Optional;
@RestController
public class UserController {

    private UserService userService;
    
    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/user")
    public User getUser(@RequestParam Integer id){
        Optional <User> user = userService.getUser(id);
        if(user.isPresent()){
            return (User) user.get();
        }
        return null;
    }   
}
