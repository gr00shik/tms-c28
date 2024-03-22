package org.example;

import java.io.Serializable;

public class User extends Person implements Serializable {

    private String name;
    private int age;
    private transient Address address;
    private String login;

    public User(String name, int age, Address address) {
        super("ADMIN");
        System.out.println("Constructor");
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public User() {
        super("ADMIN");
        System.out.println("Constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
