package org.example;

import org.model.Cat;

public class MainInvokeMethodObject {

    public static void main(String[] args) {

        Cat cat = new Cat("1");

        cat.sayMya();

        cat = changeName(cat, "2");

        cat.sayMya();

    }

    public static Cat changeName(Cat cat, String newName) {
        cat = new Cat("");
        return cat;
    }

}
