package com.thoughtpay.controllers;

import com.thoughtpay.domain.User;
import com.thoughtpay.services.HomeService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;


public class HomeControllerTest {

    @Mock
    private ModelMap model;

    @Mock
    private HomeService homeService;

    @InjectMocks
    private HomeController homeController;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
    }

    @Test
    public void shouldNavigateToHomePageWhenAppStarts() {
        ModelAndView homeModelAndView = homeController.getHomePage(model);
        assertEquals("home", homeModelAndView.getViewName());
    }

    @Test
    public void shouldGetAllUsersWhenAppStarts() {
        homeController.getHomePage(model);
        verify(homeService).getAllUsers();
    }

    @Test
    public void shouldAddUsersToModelWhenAppStarts() throws Exception {
        homeController.getHomePage(model);
        List<User> allUsers = new ArrayList<>();
        when(homeService.getAllUsers()).thenReturn(allUsers);
        verify(model).addAttribute("users", allUsers);
    }
}