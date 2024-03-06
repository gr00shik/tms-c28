package tms.oop3;

public class Employee {

    private String name;
    private Prof prof;
    private int age;

    public Employee(String name, Prof prof, int age) {
        this.name = name;
        this.prof = prof;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Prof getProf() {
        return prof;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", prof=" + prof +
                ", age=" + age +
                '}';
    }
}
