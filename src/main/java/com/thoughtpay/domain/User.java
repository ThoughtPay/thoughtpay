package com.thoughtpay.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@NoArgsConstructor
public class User {

    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private String userName;

    @Getter
    @Setter
    private String firstName;

    @Getter
    @Setter
    private String lastName;


    public User(String id, String userName, String firstName, String lastName) {
        this.id = id;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return id.equals(user.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    public String generateID() {
        return UUID.randomUUID().toString();
    }

}
