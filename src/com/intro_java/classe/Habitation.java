package com.intro_java.classe;

public class Habitation {
    private String nom;
    private double longueur;
    private double largeur;

    private int  nbreEtage;

    public Habitation(){}
    public Habitation(String nom, double longueur, double largeur, int nbreEtage){
        this.nom = nom;
        this.longueur= longueur;
        this.largeur= largeur;
        this.nbreEtage = nbreEtage;
    }

    public void setNbreEtage(int nbreEtage) {
        this.nbreEtage = nbreEtage;
    }

    public int getNbreEtage() {
        return nbreEtage;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getNom() {
        return nom;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }
    public double getLongueur() {
        return longueur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getLargeur() {
        return largeur;
    }

    public double Surface(){
        return  (this.largeur * this.longueur)* this.nbreEtage;
    }

}
