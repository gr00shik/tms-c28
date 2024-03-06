package tms.oop;

public class Client extends Person {

    public Client() {
//        super(null, null);
    }

    public Client(String name) {
        super(name, null);
    }

    public Client(String name, String nickname) {
        super(name, nickname);
    }

    @Override
    public final void dressCode() {
        super.dressCode();
        sayHello();
        testPackagePrivate();
        testProtected();
        System.out.println(name);
    }

}
