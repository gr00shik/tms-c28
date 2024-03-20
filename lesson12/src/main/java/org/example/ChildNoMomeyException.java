package org.example;

public class ChildNoMomeyException extends NoMoneyException {

    public ChildNoMomeyException(int currentValue, int diffValue) {
        super(currentValue, diffValue);
    }
}
