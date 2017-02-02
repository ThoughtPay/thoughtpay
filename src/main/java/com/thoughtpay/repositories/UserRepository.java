package com.thoughtpay.repositories;

import com.thoughtpay.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public List<User> getAllUsers() {
        List<User> allUsers = new ArrayList<>();

        User nwinston = new User("1", "nwinston", "Napoleon", "Winston");
        User wsugar = new User("2", "wsugar", "Whiskers", "Sugar");
        User sharley = new User("3", "sharley", "Sylvester", "Harley");

        allUsers.add(nwinston);
        allUsers.add(wsugar);
        allUsers.add(sharley);

        return allUsers;
    }
}
