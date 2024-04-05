package org.example;

import java.util.Scanner;

public class MainService {

    public void run() {

        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();

//        MessageSaver messageSaver = new MessageSaver() {
//            @Override
//            public void save(String message) {
//                System.out.println("save to database " + message);
//            }
//        };

        // (переменные) -> {реализация}


        saveMessage(next, msg -> System.out.println("save to database " + msg));

    }

    private void saveMessage(String message, MessageSaver messageSaver) {
        messageSaver.save(message);
    }

}
