package org.example;

import java.io.Serializable;

public class Person implements Serializable {

    private String role;

    public Person(String role) {
        System.out.println("Person constructor");
        this.role = role;
    }

}
