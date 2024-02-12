package com.intro_java.classe;

public class Habitation {
    private String nom;
    private Double longueur;
    private Double largeur;

    public Habitation(){}
    public Habitation(String nom, Double longueur, Double largeur){
        this.nom = nom;
        this.longueur= longueur;
        this.largeur= largeur;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getNom() {
        return nom;
    }

    public void setLongueur(Double longueur) {
        this.longueur = longueur;
    }
    public Double getLongueur() {
        return longueur;
    }

    public void setLargeur(Double largeur) {
        this.largeur = largeur;
    }

    public Double getLargeur() {
        return largeur;
    }

    public Double Surface(){
        return  this.largeur * this.longueur;
    }

}
