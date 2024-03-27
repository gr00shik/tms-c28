package org.example;

public class Main {
    public static void main(String ... args) {
// Hello  World !

        int i = 0, j =10;

        User user = new User()
                .setUsername("name")
                .setPassword("qwerty")
                .setAge(20);

        String builder = new StringBuffer()
                .append("Hello")
                .reverse()
                .append(" ")
                .append("world")
                .toString();

        System.out.println(builder);



//        String text = "hello";


//        Service service = new Service();
//        service.print(null);
//        // Hello <<username>> today you have <<age>> years
//        String username = "Vasya";
//        int age = 20;
//
//        String format = String.format("Hello %s today you have %s years %s", username, age, new Date());
//
////        String text = "Hello " + username + " today you have " + age + " years";
//
//        System.out.println(format);

//        String join = String.join("\\n", "AAA", "BBB", "CCC");
//        System.out.println(join);


//        String phones = "101\\102\\103";
//        System.out.println(phones);
//        String text2 = "Hello World. i am java developer.";

//        String[] split = phones.split(":");

//        System.out.println(phones.replace("\n", ""));


//        System.out.println(text1.substring(10, 15));

//        text1 = text1.replace(".", "!");
//        System.out.println(text1);

//        String text = "      ";
//
//        System.out.println(text.toLowerCase());
//        System.out.println(text.toUpperCase());
//        System.out.println(text.trim());
//        byte[] bytes = text.getBytes();

//        System.out.println(Arrays.toString(bytes));

//        System.out.println(text.isEmpty());
//        System.out.println(text.isBlank());

//        System.out.println(text1.equalsIgnoreCase(text2));

//        System.out.println(text1.charAt(100));
//        System.out.println(text1.length());

//        System.out.println(text1.contains("World"));

//        System.out.println(text1.lastIndexOf("l"));

//        System.out.println(text1.repeat(3));



    }
}