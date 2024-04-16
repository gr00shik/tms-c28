package org.example.jav;

import org.example.User;

public class Main {
    public static void main(String[] args) {

        var oldStr = "line1\n\tline2\n\n\tline3\n";

        String text = """
                line1
                    line2
                    
                    line3
                """;
        System.out.println(oldStr);
        System.out.println(text);

        Order2 order2 = new Order2();

        Object user = new User();

        user.equals()


    }

}
