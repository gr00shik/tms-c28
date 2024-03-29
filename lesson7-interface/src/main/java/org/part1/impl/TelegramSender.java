package org.part1.impl;

import org.part1.MessageDeleter;
import org.part1.MessageSender;

public class TelegramSender implements MessageSender, MessageDeleter {

    @Override
    public void send(String text, String destination) {
        System.out.println("auth to telegram");
        System.out.println("Send message " + text);
    }

    @Override
    public void deleteMessage(String messageId) {
        MessageDeleter.super.deleteMessage(messageId);
        System.out.println("telegram delete message with id " + messageId);
    }

    public static int sum(int v1, int v2) {
        return v1 / v2;
    }

}
