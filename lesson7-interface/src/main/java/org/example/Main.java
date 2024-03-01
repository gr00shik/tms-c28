package org.example;

import org.example.abstr.Dog;
import org.example.abstr.HomeDog;
import org.example.enums.Genre;
import org.example.impl.EmailSender;
import org.example.impl.TelegramSender;

public class Main {

    public static void main(String[] args) {

        String text = "skin mne deneg";
        String destination = "mama";

        EmailSender messageSender = new EmailSender();
        messageSender.test();

        NotifyService service = new NotifyService();
        service.sendMessage(text, destination, new EmailSender());

        service.delete("id", new TelegramSender());

        TestStatic.testStaticMethod();
        int result = MessageDeleter.sum(30, 40);
        int result2 = TelegramSender.sum(50, 40);

        System.out.println(MessageDeleter.HEADER);

        Dog animalIntr = new HomeDog();
        animalIntr.eat();

        Genre.COMEDY.printDescription();
    }

}
