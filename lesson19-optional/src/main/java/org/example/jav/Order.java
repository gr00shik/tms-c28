package org.example.jav;

public class Order {

    private final String name;
    private final Integer number;
    private final String username;

    public Order(String name, Integer number, String username) {
        this.name = name;
        this.number = number;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public Integer getNumber() {
        return number;
    }

    public String getUsername() {
        return username;
    }
}
