package com.company;

/**
 * Created by info on 30/10/2016.
 */
public class PointNom  extends PointA
{
    protected String nom;

    public PointNom(int x, int y, String nom)
    {
        super(x,y);
        this.nom=nom;
    }

    public void afficheNom()
    {
        super.affichecoord();
        System.out.println("Nom de l'objet : " + nom);
    }
}
