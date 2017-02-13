package com.thoughtpay.services;

import com.thoughtpay.domain.User;
import com.thoughtpay.repositories.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class UserServiceTest {

    private final String randomId = "2";

    @Mock
    UserRepository userRepository;

    @Mock
    User user;

    @InjectMocks
    UserService userService;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
    }

    @Test
    public void shouldUpdateRepository() {
        userService.update(user);
        verify(userRepository).update(user);
    }

    @Test
    public void shouldCreateUserInRepository() {
        userService.create(user);
        verify(userRepository).create(user);
    }

    @Test
    public void shouldGetUserFromId() throws Exception {
        when(userRepository.getById(randomId)).thenReturn(user);
        User userFromRepository = userService.getUser(randomId);
        assertSame(user, userFromRepository);
    }

    @Test
    public void shouldDeleteUserFromRepository() throws Exception {
        userService.delete(randomId);
        verify(userRepository).delete(randomId);
    }
}
