package org.part4;

public class Main {

    public static void main(String[] args) {

        Object user = new User("test");
        Object cat = new Cat("umka");

        Service service = new Service();
        service.rename(100);
//        service.rename(user);
//        service.rename(cat);
    }

}
