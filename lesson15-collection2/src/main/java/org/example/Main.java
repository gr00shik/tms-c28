package org.example;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<User> users = new TreeSet<>(new UserComparatorName());

        User user1 = new User("test1", 20);
        User user2 = new User("test2", 30);
        User user3 = new User("test3", 40);
        User user4 = new User("test4", 30);

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        System.out.println(users);

//        for (User usr : users) {
//            System.out.println(usr);
//        }


//        Set<String> strs = new HashSet<>();
//
//        strs.add("first");
//        strs.add("second");
//        strs.add("third");
//
//        System.out.println(strs);
//
//        Set<String> result = new HashSet<>();
//
//        for(String str : strs) {
//            if (str.startsWith("f")) {
//                result.add(str);
//            }
//        }
//
//        System.out.println(strs.size());
//        System.out.println(strs.isEmpty());
//
//        System.out.println(result);
//
//        Set<User> users = new HashSet<>();
//
//        User user = new User("test1", 20);
//        User user1 = new User("test2", 30);
//
//        users.add(user1);
//        users.add(user);
//
//        user.setAge(21);




    }
}