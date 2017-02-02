package com.thoughtpay.services;

import com.thoughtpay.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {
    private List<User> allUsers;

    public List<User> getAllUsers() {
        allUsers = new ArrayList<>();

        User nwinston = new User("1", "nwinston", "Napoleon", "Winston");
        User wsugar = new User("2", "wsugar", "Whiskers", "Sugar");
        User sharley = new User("3", "sharley", "Sylvester", "Harley");

        allUsers.add(nwinston);
        allUsers.add(wsugar);
        allUsers.add(sharley);

        return allUsers;
    }
}
