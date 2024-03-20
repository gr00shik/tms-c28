package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMain {

    public static void main(String[] args) {

        String text = "sda;dasd";

        // []
        // [^]
        // .
        // +
        // *
        // {begin, end}
        // |
        // ?
        // ()?

        Pattern pattern = Pattern.compile("375(29|33|44)[0-9]{7}");

        Matcher matcher = pattern.matcher("375331234567");

//        while (matcher.find()) {
//            System.out.println(matcher.start() + "  " + matcher.group());
//        }

        System.out.println(matcher.matches());


    }

}
