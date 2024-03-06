package tms.oop;

public class Person extends Worker {

    protected String name;
    private String nickname;
    private Integer age;

    public Person() {
        System.out.println("parent");
        testPrivate();
    }

    public Person(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
    }

    public Person(String name, String nickname, Integer age) {
        this.name = name;
        this.nickname = nickname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                '}';
    }

    public void dressCode() {
        System.out.println("nado odevatsya");
        testPrivate();
    }

    public void sayHello() {
        System.out.println("Hello");
        testProtected();
    }

    public void sayHello(String welcomeText) {
        System.out.println(welcomeText);
        testProtected();
    }

    private void testPrivate() {
        System.out.println("private");
        testPackagePrivate();
    }

    void testPackagePrivate() {
        System.out.println("package private");
    }

    protected void testProtected() {
        System.out.println("protected");
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
