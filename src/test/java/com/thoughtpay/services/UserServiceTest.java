package com.thoughtpay.services;

import com.thoughtpay.domain.User;
import com.thoughtpay.repositories.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * Created by jbealle on 2/6/17.
 */
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
        String id = "1";
        userService.update(id, user);
        verify(userRepository).update(id, user);
    }
}
