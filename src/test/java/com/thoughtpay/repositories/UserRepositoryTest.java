package com.thoughtpay.repositories;

import com.thoughtpay.domain.User;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

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
    public void getConsultantById() throws Exception {
        String id = "2";
        User user = userRepository.getById(id);
        assertEquals(id, user.getId());

    }

    @Test
    public void shouldUpdateUserWithID() {
        String firstName = "Socks";
        nwinston.setFirstName(firstName);
        userRepository.update(nwinston);
        assertEquals(firstName, userRepository.getById(nwinston.getId()).getFirstName());


    }
}