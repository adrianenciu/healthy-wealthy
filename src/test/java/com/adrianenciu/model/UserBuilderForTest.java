package com.adrianenciu.model;

public class UserBuilderForTest {

    private String firstName;
    private String lastName;

    private UserBuilderForTest() {
    }

    public static UserBuilderForTest aUser() {
        return new UserBuilderForTest();
    }

    public User build() {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return user;
    }

    public UserBuilderForTest withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilderForTest withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

}
