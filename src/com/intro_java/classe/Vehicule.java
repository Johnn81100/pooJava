package com.intro_java.classe;

public class Vehicule {
    private String name;
    private int nbreRoue;
    private int vitesse;

    public Vehicule(){}

    public void setName(String nom) {
        this.name = nom;
    }

    public void setNbreRoue(int nbreRoue) {
        this.nbreRoue = nbreRoue;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public String getName() {
        return name;
    }

    public int getNbreRoue() {
        return nbreRoue;
    }

    public int getVitesse() {
        return vitesse;
    }

    public Vehicule(String nom, int nbreRoue, int vitesse){
        this.name = nom;
        this.nbreRoue = nbreRoue;
        this.vitesse = vitesse;

    }

    public void boost (){
        this.vitesse +=  50;
    }

    public String method(){
        if ( this.nbreRoue == 4){
            return "voiture";
        } else if ( this.nbreRoue == 2) {
            return "moto";
        } else  {
            return "autre";
        }
    }

    public String  plusRapide( Vehicule vehicule){
        return this.vitesse > vehicule.getVitesse() ? this.getName()+ " et " + this.getVitesse() : vehicule.getName() + " et " + vehicule.vitesse;
    }
}
