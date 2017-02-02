package com.thoughtpay.controllers;

import com.thoughtpay.services.HomeService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.Model;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class HomeControllerTest {

    private Model model;
    private HomeController homeController;
    private HomeService homeService;

    @Before
    public void setUp() throws Exception {
        model = mock(Model.class);
        homeService = mock(HomeService.class);
        homeController = new HomeController(homeService);
    }

    @Test
    public void shouldNavigateToHomePageWhenAppStarts() {
        assertThat("home", is(homeController.getHomePage(model)));
    }

    @Test
    public void shouldGetAllUsersWhenAppStarts() {
        homeController.getHomePage(model);
        verify(homeService).getAllUsers();
    }

}