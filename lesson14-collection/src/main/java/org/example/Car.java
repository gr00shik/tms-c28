package org.example;

public class Car implements Comparable<Car>{

    private String ser;
    private Integer number;

    // AB 123456
    // ER 234567

    @Override
    public int compareTo(Car o) {
        if (!ser.equals(o.getSer())) {
            return ser.compareTo(o.getSer());
        }

        return number - o.getNumber();
    }

    public String getSer() {
        return ser;
    }

    public Integer getNumber() {
        return number;
    }
}
