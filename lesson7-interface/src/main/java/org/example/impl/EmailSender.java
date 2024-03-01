package org.example.impl;

import org.example.MessageSender;

public class EmailSender implements MessageSender {

    @Override
    public void send(String text, String destination) {
        System.out.println("prepare email server exchanger");
        System.out.println("set address to " + destination);
        System.out.println("send text " + text);
    }

    public void test() {

    }
}
