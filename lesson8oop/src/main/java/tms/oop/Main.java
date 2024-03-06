package tms.oop;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Client("andrey");
        Person person2 = new Client("sergey");

        person1.dressCode();
        person2.sayHello();

        person1.testPackagePrivate();
        person1.testProtected();


    }

}
