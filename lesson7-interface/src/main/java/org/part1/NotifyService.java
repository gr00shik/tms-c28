package org.part1;

public class NotifyService {

    public void sendMessage(String message, String destination, MessageSender sender) {
        sender.send(message, destination);
    }

    public void delete(String messageId, MessageDeleter deleter) {
        deleter.deleteMessage(messageId);
    }

}
