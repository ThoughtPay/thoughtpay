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

    @InjectMocks
    private UserRepository userRepository;

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
        String id = "2";
        User mike = new User(id, null, "Mike", null);
        when(usersData.containsKey(id)).thenReturn(true);
        when(usersData.get(id)).thenReturn(mike);

        User result = userRepository.getById(id);

        assertEquals(result, mike);
    }

    @Test
    public void shouldUpdateUserWithID() {
        String id = "2";
        User mike = new User(id, null, "Mike", null);
        when(usersData.containsKey(id)).thenReturn(true);

        userRepository.update(mike);

        verify(usersData).put(id, mike);
    }

    @Test
    public void shouldSaveUser() {
        User testUser = new User();

        userRepository.save(testUser);

        verify(usersData).put(any(String.class), eq(testUser));
    }

}