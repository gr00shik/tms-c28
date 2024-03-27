package org.example;

import java.util.Objects;

public class Child {

    private String name;
    private boolean isMan;
    private int age;

    public Child(String name, boolean isMan, int age) {
        this.name = name;
        this.isMan = isMan;
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Child{");
        sb.append("name='").append(name).append('\'');
        sb.append(", isMan=").append(isMan);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Child child = (Child) o;

        if (isMan != child.isMan) return false;
        if (age != child.age) return false;
        return Objects.equals(name, child.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (isMan ? 1 : 0);
        result = 31 * result + age;
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMan() {
        return isMan;
    }

    public void setMan(boolean man) {
        isMan = man;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
