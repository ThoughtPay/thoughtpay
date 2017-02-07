package com.thoughtpay.repositories;

import com.thoughtpay.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Repository
public class UserRepository {
    private HashMap<String, User> allUsers;


    public UserRepository() {

        User nwinston = new User("1", "nwinston", "Napoleon", "Winston");
        User wsugar = new User("2", "wsugar", "Whiskers", "Sugar");
        User sharley = new User("3", "sharley", "Sylvester", "Harley");

        allUsers = new HashMap<>();
        allUsers.put("1", nwinston);
        allUsers.put("2", wsugar);
        allUsers.put("3", sharley);
    }

    public List<User> getAllUsers() {
        List<User> userList = new ArrayList<>(allUsers.values());
        return userList;
    }

    public void update(User user) {
        String id = user.getId();
        if (allUsers.containsKey(id)) {
            allUsers.put(id, user);
        }
    }

    public User getById(String id) {
        if (allUsers.containsKey(id)) {
            return allUsers.get(id);
        }
        return null;
    }
}
