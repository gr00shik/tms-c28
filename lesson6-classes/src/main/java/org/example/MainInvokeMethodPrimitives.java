package org.example;

public class MainInvokeMethodPrimitives {
    public static void main(String[] args) {

        int numb = 10;
        System.out.println(numb);

        numb = incInt(numb);

        System.out.println(numb);
    }

    public static int incInt(int value) {
        value++;
        System.out.println(value);
        return value;
    }

}