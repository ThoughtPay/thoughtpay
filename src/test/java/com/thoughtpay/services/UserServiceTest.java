package com.thoughtpay.services;

import com.thoughtpay.domain.User;
import com.thoughtpay.repositories.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.verify;
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
    public void shouldSaveUserInRepository() {
        userService.saveNewUser(user);
        verify(userRepository).save(user);
    }
}
