package com.spring.repository;


import com.spring.db.DatabaseConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    private final DatabaseConnection databaseConnection;

    @Autowired
    public UserRepository(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    public List<String> findAllUsers() {
        return this.databaseConnection.getUsers();
    }

    public void printAllUsersName() {
        for (String usernames : databaseConnection.getUsers()) {
            System.out.println(usernames);
        }
    }

    public int totalUsers() {
        return this.databaseConnection.getUsers().size();
    }

    public void createUser(String username) {
        databaseConnection.getUsers().add(username); //here do not get confused on seeing how getUsers().add() is a valid operation.
//        it's a valid call because, getUsers() returns back an user obj of type List<String> that is why!

    }

    public void removeUser(String username){
         databaseConnection.getUsers().remove(username);
    }
}
