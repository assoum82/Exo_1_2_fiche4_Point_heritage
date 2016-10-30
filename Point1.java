package com.company;

/**
 * Created by info on 30/10/2016.
 */
public class Point1
{
    private double x;
    private double y;

    public Point1()
    {
        this.x=this.y=0;
    }
    public Point1(double x)
    {
        this.x=this.y=x;
    }

    public Point1(double x, double y)
    {
        this.x=x;
        this.y=y;
    }

    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }

    public void deplace(int dx, int dy)
    {
        x+=dx;
        y+=dy;
    }
}
