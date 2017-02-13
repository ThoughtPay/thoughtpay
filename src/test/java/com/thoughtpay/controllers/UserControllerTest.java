package com.thoughtpay.controllers;

import com.thoughtpay.domain.User;
import com.thoughtpay.services.UserService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;


public class UserControllerTest {

    @Mock
    private User user;

    @Mock
    private UserService userService;

    @Mock
    private ModelMap model;

    @InjectMocks
    private UserController userController;

    String id;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
        id = anyString();
    }

    @Test
    public void shouldUpdateUser() throws Exception {
        userController.update(user);
        verify(userService).update(user);
    }

    @Test
    public void shouldGetUserToDisplay() throws Exception {
        userController.getUserProfilePage(id, model);
        verify(userService).getUser(id);
    }

    @Test
    public void shouldCreateUserWhenFormIsSubmitted() throws Exception {
        userController.create(user);
        verify(userService).create(user);
    }

    @Test
    public void shouldDeleteUser() throws Exception {
        userController.delete(user);
        verify(userService).delete(user);
    }

    @Test
    public void shouldAddUserToModelWhenVisitingProfile() throws Exception {
        when(userService.getUser(id)).thenReturn(user);
        userController.getUserProfilePage(id, model);
        verify(model).addAttribute("user", user);
    }
    @Test
    public void shouldNavigateToProfile() {
        ModelAndView modelAndView = userController.getUserProfilePage(id, model);
        assertEquals("userProfile", modelAndView.getViewName());
    }
}