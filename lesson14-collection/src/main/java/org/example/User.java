package org.example;

import java.util.List;
import java.util.Objects;

public class User {

    private String login;
    private int age;
    private List<Child> children;

    public User(String login, int age, List<Child> children) {
        this.login = login;
        this.age = age;
        this.children = children;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return Objects.equals(login, user.login);
    }

    @Override
    public int hashCode() {
        return login != null ? login.hashCode() : 0;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("login='").append(login).append('\'');
        sb.append(", age=").append(age);
        sb.append(", children=").append(children);
        sb.append('}');
        return sb.toString();
    }
}
