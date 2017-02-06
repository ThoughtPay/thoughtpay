package com.thoughtpay.domain;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class UserTest {
    @Test
    public void shouldNotBeEqualWhenTwoUsersHaveDifferentIDs() {
        User testUser1 = new User("1", "TestUserName", "TestFirst", "TestLast");
        User testUser2 = new User("2", "TestUserName", "TestFirst", "TestLast");
        assertNotEquals(testUser1, testUser2);
    }

}