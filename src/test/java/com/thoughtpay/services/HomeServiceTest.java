package com.thoughtpay.services;

import com.thoughtpay.repositories.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

public class HomeServiceTest {

    @Mock
    UserRepository userRepository;

    @InjectMocks
    HomeService homeService;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
    }

    @Test
    public void shouldGetAllUsers() throws Exception {
        homeService.getAllUsers();
        verify(userRepository).getAllUsers();
    }
}