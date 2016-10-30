package com.company;

public class Main {

    public static void main(String[] args)
    {
	    PointNom pn = new PointNom(5,2,"Cordonée1");
        pn.afficheNom();

        PointA pn0 = new PointA(2.5,3.5);
        pn0.affichecoord();

        Point1 pn1 = new Point1(1.5,3.5);
        pn1.deplace((int) 1.5, (int) 3.5);
        pn0.affichecoord();
    }
}
