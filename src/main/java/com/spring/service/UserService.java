package com.spring.service;

import org.springframework.stereotype.Service;
import com.spring.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    UserRepository userRepository;

    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(String username){
        userRepository.createUser(username);
        System.out.println("User created successfully");
    }

    public List<String> showUser()
    {
         userRepository.printAllUsersName();
        System.out.println("Total Users:" + userRepository.totalUsers());
        return userRepository.findAllUsers();
    }

    public void updateUser(String username)
    {
        userRepository.createUser(username);
        System.out.println("List updated successfully");
    }

    public void deleteUser(String username)
    {
        userRepository.removeUser(username);
        System.out.println("User deleted successfully");
    }



}
