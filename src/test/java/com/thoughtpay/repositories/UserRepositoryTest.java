package com.thoughtpay.repositories;

import com.thoughtpay.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.initMocks;

public class UserRepositoryTest {

    @Mock
    private HashMap<String, User> usersData;

    @Mock
    private User user;

    @InjectMocks
    private UserRepository userRepository;
    private final String randomId = "2";


    @Before
    public void setUp() throws Exception {
        initMocks(this);
    }

    @Test
    public void shouldGetAllUsers() throws Exception {
        List<User> users = new ArrayList<>();
        when(usersData.values()).thenReturn(users);
        List<User> result = userRepository.getAllUsers();
        assertEquals(result, users);
    }

    @Test
    public void shouldGetUserById() throws Exception {
        when(usersData.containsKey(randomId)).thenReturn(true);
        when(usersData.get(randomId)).thenReturn(user);
        User result = userRepository.getById(randomId);
        assertEquals(result, user);
    }

    @Test
    public void shouldUpdateUserWithID() {
        when(usersData.containsKey(randomId)).thenReturn(true);
        when(user.getId()).thenReturn(randomId);
        userRepository.update(user);
        verify(usersData).put(randomId, user);
    }

    @Test
    public void shouldCreateUser() {
        when(user.generateID()).thenReturn(randomId);
        userRepository.create(user);
        verify(usersData).put(randomId, user);
    }

    @Test
    public void shouldDeleteUser() throws Exception {
        userRepository.create(user);
        userRepository.delete(user);
        verify(usersData).remove(user.getId());
    }
}