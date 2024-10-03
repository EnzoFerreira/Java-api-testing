package com.apitest.demo.service;

import com.apitest.demo.api.model.*;
import org.springframework.stereotype.Service;

import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
@Service
public class UserService {

    private List<User> userList;

    public UserService(){
        userList = new ArrayList<>();

        User user1 = new User(1,"teste",12,"teste@gmail.com");
        User user2 = new User(2, "teste2", 12, "teste2@gmail.com");

        userList.addAll(Arrays.asList(user1, user2));
    }


    public Optional<User> getUser(Integer id){
        Optional optional = Optional.empty();
        for (User user: userList){
            if(id == user.getId()){
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
