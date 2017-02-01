package com.thoughtpay.services;

import com.thoughtpay.domain.User;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class HomeServiceTest {
    private HomeService homeService;
    private User nwinston, wsugar;

    @Before
    public void setUp() throws Exception {
        homeService = new HomeService();
        nwinston = new User("nwinston");
        wsugar = new User("wsugar");
    }

    @Test
    public void shouldGetListOfAllUsersWhenListIsSizeOne() throws Exception {
        List<User> allUsers = homeService.getAllUsers();
        assertThat(nwinston.getUsername(), is(allUsers.get(0).getUsername()));
    }

    @Test
    public void shouldGetListOfAllUsersWhenListIsSizeTwo() throws Exception {
        List<User> allUsers = homeService.getAllUsers();
        assertThat(nwinston.getUsername(), is(allUsers.get(0).getUsername()));
        assertThat(wsugar.getUsername(), is(allUsers.get(1).getUsername()));
    }
}