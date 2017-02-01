package com.thoughtpay.services;

import com.thoughtpay.domain.User;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class HomeServiceTest {
    private HomeService homeService;
    private User nwinston, wsugar, sharley;

    @Before
    public void setUp() throws Exception {
        homeService = new HomeService();
        nwinston = new User("1", "nwinston", "Napoleon", "Winston");
        wsugar = new User("2", "wsugar", "Whiskers", "Sugar");
        sharley = new User("3", "sharley", "Sylvester", "Harley");
    }

    @Test
    public void shouldGetListOfAllUsersWhenListIsSizeOne() throws Exception {
        List<User> allUsers = homeService.getAllUsers();
        assertThat(nwinston.getUserName(), is(allUsers.get(0).getUserName()));
    }

    @Test
    public void shouldGetListOfAllUsersWhenListIsSizeTwo() throws Exception {
        List<User> allUsers = homeService.getAllUsers();
        assertThat(nwinston.getUserName(), is(allUsers.get(0).getUserName()));
        assertThat(wsugar.getUserName(), is(allUsers.get(1).getUserName()));
    }

    @Test
    public void shouldGetListOfAllUsersWhenListIsAnySize() throws Exception {
        List<User> allUsers = homeService.getAllUsers();
        List<User> dummyUsers = new ArrayList<>();
        dummyUsers.add(nwinston);
        dummyUsers.add(wsugar);
        dummyUsers.add(sharley);

        assertEquals(dummyUsers, allUsers);
    }
}