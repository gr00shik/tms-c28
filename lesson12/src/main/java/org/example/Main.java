package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoMoneyException {


        while (true) {

            Scanner scanner = new Scanner(System.in);
            int diff = scanner.nextInt();

            try {
                Card card = new Card();
                Bankomat bankomat = new Bankomat();
                int result = bankomat.changeMoney(diff, card);
                System.out.println(result);
            } catch (NoMoneyException exc) {
                int currentValue = exc.getCurrentValue();
                int diffValue = exc.getDiffValue();
                System.out.println(String.format("No needed balance on card. Balance %s, requst operation %s", currentValue, diffValue));
            }

            }


    }

}