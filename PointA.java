package com.company;


/**
 * Created by info on 30/10/2016.
 */

public class PointA extends Point1 {
    public PointA(double x, double y) {
        super(x, y);
    }

    public PointA(double x) {
        super(x);
    }

    public PointA() {
        super();
    }

    public void affichecoord() {
        System.out.println("x = " + super.getX() + "\n" + "y = " + super.getY());
    }
}