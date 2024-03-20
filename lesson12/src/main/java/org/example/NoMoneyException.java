package org.example;

public class NoMoneyException extends Exception {

    private int currentValue;
    private int diffValue;

    public NoMoneyException(int currentValue, int diffValue) {
        this.currentValue = currentValue;
        this.diffValue = diffValue;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public int getDiffValue() {
        return diffValue;
    }
}
