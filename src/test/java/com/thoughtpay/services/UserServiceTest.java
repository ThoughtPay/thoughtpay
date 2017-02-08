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
        String id = "2";
        when(userRepository.getById(id)).thenReturn(user);
        User userFromRepository = userService.getUser(id);
        assertSame(user, userFromRepository);
    }

    @Test
    public void shouldDeleteUserFromRepository() throws Exception {
        userService.deleteUser(user);
        verify(userRepository).delete(user);

    }
}
