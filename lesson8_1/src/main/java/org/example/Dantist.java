package org.example;

public class Dantist extends Doctor {
    @Override
    public void heal() {
        System.out.println("udalili zubi");
    }

    @Override
    public String type() {
        return "dantist";
    }
}
