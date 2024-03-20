package org.example;

public class User {

    private String username;
    private String password;
    private int age;

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }
}
