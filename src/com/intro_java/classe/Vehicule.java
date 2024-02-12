package com.intro_java.classe;

public class Vehicule {
    private String nom;
    private int nbreRoue;
    private int vitesse;

    public Vehicule(){}

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbreRoue(int nbreRoue) {
        this.nbreRoue = nbreRoue;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public String getNom() {
        return nom;
    }

    public int getNbreRoue() {
        return nbreRoue;
    }

    public int getVitesse() {
        return vitesse;
    }

    public Vehicule(String nom, int nbreRoue, int vitesse){
        this.nom = nom;
        this.nbreRoue = nbreRoue;
        this.vitesse = vitesse;

    }

    public void boost (){
        this.vitesse +=  50;
    }

    public String method(){
        if ( this.nom ==="voiture"){
            return "voiture";
        } else if (this.nom === "moto") {
            return "moto";
        } else  {
            return "autre";
        }


    }
}
