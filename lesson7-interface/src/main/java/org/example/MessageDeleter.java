package org.example;

public interface MessageDeleter {

    String HEADER = "header text";
    String text = "";

    default void deleteMessage(String messageId) {
        System.out.println(getFinalMessage(messageId));
    }

    private String getFinalMessage(String message) {
        return "delete message with id " + message;
    }

    static int sum(int v1, int v2) {
        return v1 + v2;
    }

}
