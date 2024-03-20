package org.example;

public interface ChangeBalance {
    int credit(int diff);
    int debit(int diff) throws NoMoneyException;
}
