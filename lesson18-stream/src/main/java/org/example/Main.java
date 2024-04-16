package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {

        List<User> users = List.of(
                new User("user1", 20, Sex.MAN, true,List.of(
                        new Child("child1", 15, List.of("h1", "h2")),
                        new Child("child2", 9, List.of("h1", "h2"))
                )),
                new User("user2", 60, Sex.WOMAN, false, List.of(
                        new Child("child3", 10, List.of("h1", "h2")),
                        new Child("child4", 5, List.of("h1", "h2")),
                        new Child("child5", 11, List.of("h1", "h2"))
                )),
                new User("user3", 20, Sex.WOMAN, false, List.of(
                        new Child("child6", 20, List.of("h1", "h2"))
                )),
                new User("user4", 50, Sex.WOMAN, true, List.of(
                        new Child("child7", 30, List.of("h1", "h2")),
                        new Child("child8", 20, List.of("h1", "h2"))
                ))
        );

        User[] array = users.toArray(User[]::new);

        // ----------------- Generate stream ----------------------
//        Stream<Integer> iterate = Stream.iterate(1, val -> val + 1);
//        Stream<String> generate = Stream.generate(() -> "text");
//        Stream<User> userStream = users.stream();
//        Stream<String> text1 = Stream.of("text1", "text2", "text3");
//        Stream<User> stream1 = Arrays.stream(array);
//
//        // ----------------- Interm stream ----------------------
//        userStream = userStream.peek(System.out::println);
//
//        // ----------------- Termination stream ----------------------
////        long count = userStream.count();
//        List<User> collect = userStream.collect(Collectors.toList());
//
//        System.out.println(collect);

        List<User> collect = users.stream()
                .filter(user -> user.getChildList() != null)
                .filter(user -> user.getChildList().size() >=2)
//                .filter(user -> user.getSex() == Sex.WOMAN)
//                .filter(user -> user.getAge() > 35)
//                .peek(System.out::println)
                .collect(toList());
        System.out.println(collect);

        var userOnVac = users.stream()
                .filter(User::isOnVac)
                .toList();

        System.out.println(userOnVac);

        // peek vs forEach
        users.stream()
                .forEach(user -> System.out.println(user.getUsername()));

        List<String> names = users.stream()
                .filter(user -> user.getSex() == Sex.WOMAN)
                .map(User::getUsername)
                .distinct()
                .map(String::toUpperCase)
                .toList();

        System.out.println(names);

        List<Child> childs = users.stream()
                .flatMap(user -> user.getChildList().stream())
                .filter(child -> child.getAge() <= 10)
                .collect(toList());

        System.out.println(childs);

        Set<String> hobbySet = new HashSet<>();
        for (User user: users) {
            if (user.isOnVac()) {
                List<Child> childList = user.getChildList();
                for (Child child : childList) {
                    Integer age = child.getAge();
                    if (age <= 10) {
                        List<String> hobbies = child.getHobbies();
                        for (String hobby : hobbies) {
                            hobbySet.add(hobby);
                        }
                    }
                }
            }
        }

//        System.out.println(childListResult);

        Set<String> hobbies = users.stream()
                .filter(User::isOnVac)
                .flatMap(user -> user.getChildList().stream())
                .filter(child -> child.getAge() <= 10)
                .flatMap(child -> child.getHobbies().stream())
                .collect(Collectors.toSet());

        System.out.println(hobbies);

//        for(int i = 1; i < 10; i++) {
//            System.out.println(i*i);
//        }
//
//        List<Integer> integers = List.of(1,2,3,4,5,6);
//
//        List<Integer> collect1 = integers.stream()
//                .map(i -> i * i)
//                .collect(toList());
//
//        System.out.println(collect1);

//        List<String> womanNames = new ArrayList<>();
//        for (User user: users) {
//            if (user.getSex() == Sex.WOMAN) {
//                String username = user.getUsername();
//                String upperCase = username.toUpperCase();
//                if (!womanNames.contains(upperCase)) {
//                    womanNames.add(upperCase);
//                }
//
//            }
//        }
//        System.out.println(womanNames);

        List<Integer> list = Stream.iterate(1, val -> val + 1)
                .skip(3)
                .map(val -> val * val)
                .filter(val -> val % 2 == 1)
                .limit(10)
                .toList();

        System.out.println(list);

        List<User> users1 = users.stream()
//                .filter(user -> !user.isOnVac())
                .sorted((user1, user2)-> user1.getAge() - user2.getAge())
                .collect(Collectors.toList());
//                .noneMatch()
//                .allMatch()
//                .anyMatch()

        System.out.println(users1);

        Set<User> collect1 = users.stream()
                .filter(user -> isChildLess10(user.getChildList()))
                .collect(Collectors.toSet());

        Map<String, Boolean> collect2 = users.stream()
                .collect(Collectors.toMap(user -> user.getUsername(), user -> isChildLess10(user.getChildList())));

//        collect2.entrySet().stream()
//                        .map(entry-> entry.get)

        System.out.println(collect2);


        Integer min = Stream.iterate(1, val -> val + 1)
                .limit(10)
                .filter(val-> val > 100)
                .mapToInt(val -> val)
                .min()
                        .getAsInt();

        System.out.println(min);

    }

    public static boolean isChildLess10(List<Child> childList) {
        return childList.stream()
                .anyMatch(child -> child.getAge()<10);
    }

}

// filter, peek, map, distinct, flatMap, skip, limit, sorted
// forEach, collect(Collectors.to...) = toList(), count, noneMatch(), anyMatch(), allMatch()