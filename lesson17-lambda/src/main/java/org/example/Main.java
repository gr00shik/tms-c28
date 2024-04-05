package org.example;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        prepareUser(30, 2500, User::new);

        UserProveder proveder = (par1, par2) -> new User(par1, par2);
        UserProveder proveder2 = User::new;


        StrInterface strInterface = String::toLowerCase;

        MyMathService myMathService = Math::max;

        // Math.min(int v1, int v2)

        ManyFuncService service = new ManyFuncService();


        System.out.println(doMathAction(10, 20, service::process));

        // String.toUpperCase
        System.out.println(strInterface.convert("abc"));


//        F1Empty f1Empty = () -> System.out.println("Hello");
//        f1Empty.test();
//
//        F1Empty f1Empty1 = () -> {
//            for(int i = 0; i < 10; i++) {
//                System.out.println("world");
//            }
//        };
//
//        f1Empty1.test();

//        F2EmptyReturn emptyReturn = () -> {
//            Scanner scanner = new Scanner(System.in);
//            return scanner.next();
//        };

//        F2EmptyReturn emptyReturn = () -> new Scanner(System.in).next();
//
//        String result = emptyReturn.test();
//
//        System.out.println(result);
//
//        runMe(() -> "Hello World!!!!");

//        final int value = 10;
//        User user = new User(10);
//
//        Function<Integer, String> f3OneParam = par1 -> {
//            StringBuilder builder = new StringBuilder();
//            for (int i = 0; i < par1; i++) {
//                builder.append("line " + i + "\n");
//            }
//            return builder.toString();
//        };
//
//        user = new User(30);
//        f3OneParam.apply(4);

//        F3OneParam f3OneParam = par -> "Hello" + par;
//
//        System.out.println(f3OneParam.test(5));


//        MainService service = new MainService();
//        service.run();

//        F4ManyParams f4ManyParams = (text, person, incValue) -> person.getAge() + incValue;
//
//        runMe(f4ManyParams, "gdajh", new User(20), 30);
//
//
        User user1 = new User(12, 3000);
        User user2 = new User(25, 2500);
//
        Set<User> set = new TreeSet<>((u1, u2) -> u1.getAge() - u2.getAge());
        set.add(user1);
        set.add(user2);
//
//        Set<User> usersSalary = new TreeSet<>((us1, u2) -> us1.getSalary() - u2.getSalary());
//        usersSalary.add(user1);
//        usersSalary.add(user2);
//
//        System.out.println(usersSalary);
//        System.out.println(set);

    }

    public static void runMe(F2EmptyReturn emptyReturn) {
        System.out.println(emptyReturn.test());
    }

    public static void runMe(F4ManyParams params, String text, User user, Integer value) {
        Integer result = params.test(text, user, value);
        System.out.println(result);
    }

    public static int doMathAction(int v1, int v2, MyMathService service) {
        return service.combine(v1, v2);
    }

    public static void prepareUser(int age, int salary, UserProveder proveder) {
        User user = proveder.create(age, salary);
        System.out.println("User created " + user);
    }

}
