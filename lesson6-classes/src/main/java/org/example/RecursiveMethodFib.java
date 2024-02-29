package org.example;

public class RecursiveMethodFib {

    public static void main(String[] args) {

        int fibNumb = 6;

        int result = fib(fibNumb);
        System.out.println(result);
    }

    public static int fib(int value) {
        return value <= 2
                ? 1
                : fib(value - 1) + fib(value - 2);
    }

}