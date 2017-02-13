package com.thoughtpay.domain;

import com.thoughtpay.UserBuilder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class UserTest {
    @Test
    public void shouldNotBeEqualWhenTwoUsersHaveDifferentIDs() {
        assertNotEquals(UserBuilder.nWinston, UserBuilder.sHarley);
    }

    @Test
    public void shouldBeEqualWhenTwoUsersHaveSameIDs() {
        UserBuilder.sHarley.setId(UserBuilder.nWinston.getId());
        assertEquals(UserBuilder.nWinston, UserBuilder.sHarley);
    }

}