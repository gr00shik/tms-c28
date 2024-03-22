package org.example;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MainSer {

    public static void main(String[] args) throws Exception {

//        User user = new User("test", 30, new Address("tolstovo"));
//
//        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("/Users/sergey/user.data"));
//        os.writeObject(user);
//        os.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/sergey/user.data"));
        User user = (User)ois.readObject();

        System.out.println(user.getName());
        System.out.println(user.getAge());

    }

}
