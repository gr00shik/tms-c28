package org.example;

public class StrInterfaceImpl implements StrInterface {
    @Override
    public String convert(String text) {
        return text.toUpperCase();
    }
}
