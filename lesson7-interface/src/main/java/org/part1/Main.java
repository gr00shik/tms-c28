package org.part1;

import org.part1.abstr.Dog;
import org.part1.abstr.HomeDog;
import org.part1.enums.Genre;
import org.part1.impl.EmailSender;
import org.part1.impl.TelegramSender;

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
