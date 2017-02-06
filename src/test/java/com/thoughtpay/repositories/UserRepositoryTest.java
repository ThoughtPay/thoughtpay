package com.thoughtpay.repositories;

import com.thoughtpay.domain.User;
import com.thoughtpay.services.HomeService;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UserRepositoryTest {
    private User nwinston, wsugar, sharley;
    private List<User> allUsers;
    private UserRepository userRepository;

    @Before
    public void setUp() throws Exception {
        nwinston = new User("1", "nwinston", "Napoleon", "Winston");
        wsugar = new User("2", "wsugar", "Whiskers", "Sugar");
        sharley = new User("3", "sharley", "Sylvester", "Harley");

        userRepository = new UserRepository();

        allUsers = userRepository.getAllUsers();
    }

    @Test
    public void shouldGetListOfAllUsersWhenListIsSizeOne() throws Exception {
        assertEquals(nwinston, allUsers.get(0));
    }

    @Test
    public void shouldGetListOfAllUsersWhenListIsSizeTwo() throws Exception {
        userRepository.getAllUsers();
        assertEquals(nwinston, allUsers.get(0));
        assertEquals(wsugar, allUsers.get(1));
    }

    @Test
    public void shouldGetListOfAllUsersWhenListIsAnySize() throws Exception {
        List<User> testUsers = Arrays.asList(nwinston, wsugar, sharley);
        assertEquals(testUsers, allUsers);
    }
}