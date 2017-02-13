package com.thoughtpay;

import com.thoughtpay.domain.User;

import java.util.Arrays;
import java.util.List;

public class UserBuilder {

    public static User nWinston = createUser("1", "Napoleon", "Winston", "nWinston");
    public static User wSugar = createUser("2", "Whiskers", "Sugar", "wsugar");
    public static User sHarley = createUser("3", "Sylvester", "Harley", "sharley");
    public static List<User> allUsers = Arrays.asList(nWinston, wSugar, sHarley);

    private static User createUser(String id, String firstName, String lastName, String userName) {
        User user = new User();
        user.setId(id);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setUserName(userName);

        return user;
    }


}
