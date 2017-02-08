package com.thoughtpay.controllers;

import com.thoughtpay.domain.User;
import com.thoughtpay.services.UserService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;


public class UserControllerTest {

    @Mock
    private User user;

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
    }

    @Test
    public void shouldUpdateUser() throws Exception {
        userController.updateUser(user);
        verify(userService).update(user);
    }

    @Test
    public void shouldSaveUserWhenFormIsSubmitted() throws Exception {
        userController.createUser(user);
        verify(userService).saveNewUser(user);
    }

    @Test
    public void shouldGetUserToDisplay() throws Exception {
        String id = "1";
        userController.viewProfile(id);
        verify(userService).getUser(id);
    }
}