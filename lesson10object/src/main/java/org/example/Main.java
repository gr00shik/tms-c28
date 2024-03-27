package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

//        Integer value1 = 127;
//        Integer value2 = 127;
////
//        System.out.println(value1 == value2);

        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();

//        String text1 = new String("text");
        String text2 = "text";

        System.out.println(next == text2);

//        User user1 = new User(null, "sname", 30);
//
//        User user2 = (User)user1.clone();
//
//        System.out.println(user1.equals(user2));

    }
}

// EQUALS
// a.equals(null) = false
// a.equals(a) -> true
// a.equals(b) = true  -> b.equals(a) = true
// a.equals(b) & b.equals(c) = true -> a.equals(c) = true

// HASHCODE
// a.equals(b) = true  -> a.hashCode == b.hashCode