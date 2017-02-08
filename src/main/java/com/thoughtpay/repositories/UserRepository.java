package com.thoughtpay.repositories;

import com.thoughtpay.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserRepository {

    @Autowired
    private HashMap<String, User> allUsers;

    public List<User> getAllUsers() {
        return new ArrayList<>(allUsers.values());
    }

    public User getById(String id) {
        if (allUsers.containsKey(id)) {
            return allUsers.get(id);
        }
        return null;
    }

    public void update(User user) {
        String id = user.getId();
        if (allUsers.containsKey(id)) {
            allUsers.put(id, user);
        }
    }

    public void create(User user) {
        String id = user.generateID();
        user.setId(id);
        allUsers.put(id, user);
    }



    public void delete(User user) {
        allUsers.remove(user.getId());
    }
}
