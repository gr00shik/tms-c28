package org.example;

public class Card implements ChangeBalance {

    private Integer value = 1000;

    public int credit(int diff) {
        value = value + diff;
        return value;
    }

    public int debit(int diff) throws NoMoneyException {

        if (value + diff < 0) {
            throw new NoMoneyException(value, diff);
        }

        value = value + diff;
        return value;
    }

}
