package org.part3;

public abstract class Sender {

    public String prepareMessage(String text) {
        return  "[" + text + "]";
    }

    public abstract void sendMessage(String message);

    public abstract void fixCharacters(String message);

}
