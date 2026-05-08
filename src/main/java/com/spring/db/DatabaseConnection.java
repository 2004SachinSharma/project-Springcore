package com.spring.db;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseConnection {
    private List<String> user;

    @PostConstruct
    public void init() {
        user = new ArrayList<>();
//        user.add("admin");
        System.out.println("Db Connection initialized(Simulated)");
    }

    public List<String> getUsers() {
        return this.user;
    }

    public void addUsers(String user) {
        this.user.add(user);
    }

    public void cleanUp() {
        this.user.clear();
    }
}

