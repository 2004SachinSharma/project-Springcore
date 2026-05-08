package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.spring.service.UserService;

import java.util.List;

@Controller
public class UserController {
    private final UserService userservice;

    @Autowired
    UserController(UserService userservice) {
        this.userservice = userservice;
    }

    public void createUser(String user){
      userservice.createUser(user);
    }
    public List<String> getUser(){
        return userservice.showUser();
    }

    public void updateUser(String username){
        userservice.updateUser(username);
    }

    public void removeUser(String username){
        userservice.deleteUser(username);
    }
}
