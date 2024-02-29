package org.example;

import org.model.Cat;
import org.model.TypeCat;

public class MethodsMain {

    public static void main(String[] args) {

        Cat umka = new Cat("umka", TypeCat.MYKUN);

        if (umka.getType() == TypeCat.SIAM) {
        }



        Cat cat1 = new Cat("1");
        cat1.setName("2");
        cat1.setAge(30);

        String name = cat1.getName();

        System.out.println(name);
        System.out.println(cat1.getAge());


//        JustStaticMethod.runMeOnStatic();
//
//        MethodsMain methodsMain = new MethodsMain();
//        methodsMain.runMe();
    }

    public void runMe() {
        System.out.println("Hello");
    }

}
