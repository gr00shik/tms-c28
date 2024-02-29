package org.model;

public class Cat {

    private String name;
    private int age;
    private TypeCat type;

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, TypeCat type) {
        this.name = name;
        this.type = type;
    }

    public void sayMya() {
        System.out.println("Mya " + name);
        sayMyaPrivate();
    }

    private void sayMyaPrivate() {
        System.out.println("Mya private " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 0 || age > 20) {
            return;
        }

        this.age = age;
    }

    public TypeCat getType() {
        return type;
    }

    public void setType(TypeCat type) {
        this.type = type;
    }
}
