package com.thoughtpay.repositories;

import com.thoughtpay.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserRepository {
    private List<User> allUsers;

    public UserRepository() {

        User nwinston = new User("1", "nwinston", "Napoleon", "Winston");
        User wsugar = new User("2", "wsugar", "Whiskers", "Sugar");
        User sharley = new User("3", "sharley", "Sylvester", "Harley");

        allUsers = Arrays.asList(nwinston, wsugar, sharley);
    }

    public List<User> getAllUsers() {
        return allUsers;
    }
}
