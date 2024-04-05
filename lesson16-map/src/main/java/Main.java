import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Map<String, User> userMap = new TreeMap<>();

        userMap.put("user1", new User("user1", "test1", 30));
        userMap.put("user2", new User("user2", "test2", 35));
        userMap.put("user3", new User("user3", "test3", 25));
        userMap.put("user4", new User("user4", "test4", 15));

        User user = userMap.get("user5");

        if (userMap.containsKey("user5")) {
            User user1 = userMap.get("user5");
        }


        List<User> users = new ArrayList<>();

        Collection<User> values = userMap.values();

        for (User userItem: values) {
            if (userItem.getAge() >=30) {
                users.add(userItem);
            }
        }

        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("test1", 20);
        stringIntegerMap.put("test2", 30);
        stringIntegerMap.put("test3", 25);

//        System.out.println(stringIntegerMap.getOrDefault("test3", new ArrayList<>()));


        System.out.println(users);

//        System.out.println(userMap.containsKey("user5"));


        System.out.println(user);

    }

}
