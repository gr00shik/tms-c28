package org.part1;

public class RecursiveMethodFact {

    public static void main(String[] args) {

//        int result = 1;
//
//        for (int i = 1; i <= 5; i++) {
//            result = result * i;
//        }
//
//        System.out.println(result);

        int numb = 5;

        int result = fact(5);

        System.out.println(result);

    }

    public static int fact(int value) {
        if (value == 1) {
            return 1;
        }
        return value * fact(value - 1);
    }

}
//   5 * (4 * (3 * (2 * (1))))
