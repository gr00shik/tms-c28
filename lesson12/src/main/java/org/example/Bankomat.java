package org.example;

public class Bankomat {

    public int changeMoney(int value, ChangeBalance card) throws NoMoneyException {

        if (value < 0) {
            try {
                return card.debit(value);
            } catch (NoMoneyException | RuntimeException exc) {
                System.out.println("Bankopmat can not process transaction");
                throw exc;
            }
        } else {
            return card.credit(value);
        }

    }

}
