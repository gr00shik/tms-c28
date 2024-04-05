package org.example;

public class User {
    private Integer age;
    private Integer salary;

    public User(Integer age) {
        this.age = age;
    }

    public User(Integer age, Integer salary) {
        this.age = age;
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("age=").append(age);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
