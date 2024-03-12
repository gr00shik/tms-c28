package org.part1;

import java.util.Date;

public class Car {

    private final int dist = 20;
    private final Date date;
    private static int staticDist;

    static {
        System.out.println("static block");
        staticDist = 5000;
    }

    {
        System.out.println("block");
    }

    public Car(int dist, Date date) {
        System.out.println("Constructor");
        this.date = date;
//        this.dist = dist;
    }

    public Car() {
        date = new Date();
//        dist = 10;
    }

    public static int getStaticDist() {
        return staticDist;
    }

    public static void setStaticDist(int staticDist) {
//        System.out.println(getDist());
        staticDist++;
        Car.staticDist = staticDist;
    }

    public int getDist() {
        getStaticDist();
        System.out.println(staticDist);
        return dist;
    }

    public void setNewDate() {
        date.setHours(2);
    }

    public void setDist(int dist) {
//        this.dist = dist;
    }
}
