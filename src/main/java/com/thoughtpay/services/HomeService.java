package com.thoughtpay.services;

import com.thoughtpay.domain.User;

import java.util.ArrayList;
import java.util.List;

public class HomeService {
    private List<User> allUsers;

    public List<User> getAllUsers() {
        allUsers = new ArrayList<>();

        User nwinston = new User("nwinston");
        User wsugar = new User("wsugar");
        User sharley = new User("sharley");

        allUsers.add(nwinston);
        allUsers.add(wsugar);
        allUsers.add(sharley);

        return allUsers;
    }
}
