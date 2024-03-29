package org.example;

public class Action {

    private Type type;
    private String login;

    public enum Type {
        CREATE,
        UPDATE,
        DELETE
    }
}
