package com.thoughtpay.domain;

import jdk.nashorn.internal.objects.annotations.Getter;

public class User {

    private String id;
    private String userName;
    private String firstName;
    private String lastName;

    public User(String id, String userName, String firstName, String lastName) {
        this.id = id;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
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

}
