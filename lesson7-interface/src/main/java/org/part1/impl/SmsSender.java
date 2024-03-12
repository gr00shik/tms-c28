package org.part1.impl;

import org.part1.MessageSender;

public class SmsSender implements MessageSender {

    @Override
    public void send(String text, String destination) {
        System.out.println("request A1 balance");
        System.out.println("send sms to " + destination + " with text " + text);
    }
}
