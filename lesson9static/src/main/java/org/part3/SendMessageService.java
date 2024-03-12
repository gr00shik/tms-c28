package org.part3;

public class SendMessageService {

    public void send(String text, Sender sender) {
        String mess = sender.prepareMessage(text);
        sender.sendMessage(mess);
    }

}
