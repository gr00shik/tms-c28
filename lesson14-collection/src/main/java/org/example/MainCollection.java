package org.example;

import java.util.ArrayList;
import java.util.List;

public class MainCollection {

    public static void main(String[] args) {


        List<User> userList = new ArrayList<>();
        userList.add(new User("test1", 20, List.of(new Child("ch1", true, 5), new Child("ch2", false, 15))));
        userList.add(new User("test2", 30, List.of(new Child("ch3", true, 9))));
        userList.add(new User("test3", 40, null));

        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);

            if (isEmpty(userList)) {
                continue;
            }

            if (user.getChildren().size() > 1) {
                indexes.add(i);
            }

        }

        System.out.println(indexes);


//        List<String> names = new ArrayList<>();
//
//        Iterator<User> iterator = userList.iterator();
//
//        while (iterator.hasNext()) {
//            User user = iterator.next();
//
//            if (user.getChildren() == null) {
//                continue;
//            }
//
//            for (Child child : user.getChildren()) {
//                names.add(child.getName());
//            }
//
//        }
//
//        System.out.println(names);

//        List<Child> children = new ArrayList<>();
//
//        for (User user : userList) {
//
//            List<Child> childList = user.getChildren();
//
//            if (childList == null || childList.isEmpty()) {
//                continue;
//            }
//
//            for (Child child : childList) {
//                if (child.getAge() <= 6) {
//                    children.add(child);
//                }
//            }
//
//
//        }
//
//        System.out.println(children);


//        List<User> usersAge = new ArrayList<>();
//
//        for (User user: userList) {
//            if (!user.getChildren().isEmpty()) {
//                usersAge.add(user);
//            }
//        }
//
//        System.out.println(usersAge);


//        for (User user: userList) {
//            if (user.getAge() > 25) {
//                usersAge.add(user);
//            }
//        }

//        System.out.println(usersAge);

//        boolean isExist = false;
//
//        User findUser = new User("test2", 50);
//
//        System.out.println(userList.contains(findUser));
//
//        for (User user: userList) {
//            String login = user.getLogin();
//            if (login.equals("test4")) {
//                isExist = true;
//                break;
//            }
//        }
//
//        System.out.println(isExist ? "Find" : "Not Found");

        /*

                    ArrayList   LinkedList              HashSet                 TreeSet

         add          O(n)         O(n) O(1)           <O(1)> O(n) O(lg)            O(lgn)
         delete       O(n)         O(n) O(1)            <O(1)> O(n) O(lg)           O(lgn)
         contains     O(n)         O(n)                 <O(1)> O(n) O(lg)           O(lgn)
         get          O(1)         O(n/2)               -//-                          -//-

         O(1) - не зависит от величины коллекции
         O(n) - зависит от количества элементов
         O(n*n) -
         O(lgn) -
         */

//        List<String> strList = new ArrayList<>();
//        strList.trimToSize();
//        strList.add("str1");
//        strList.add("str2");
//
//        strList.add(1, "str3");

//        System.out.println(strList.contains("str2"));
//
//        for(String str : strList) {
//            System.out.println("element = " + str);
//        }
//
//        Service service = new Service();
//        service.isPresent("test", strList);

//        for (int i = 0; i < strList.size(); i++) {
//            System.out.println("element = " + strList.get(i));
//        }

//        Iterator<String> iterator = strList.iterator();
//
//        while (iterator.hasNext()) {
//            String el = iterator.next();
//            System.out.println("element  " + el);
//        }

//        boolean b = iterator.hasNext();
//        String next = iterator.next();
//
//        System.out.println(b);


//        System.out.println(strList);
//
//        String ind0 = strList.get(0);
//        System.out.println(ind0);

    }

    public static boolean isEmpty(List<?> objects) {
        return objects == null || objects.isEmpty();
    }

}
