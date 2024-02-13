package com.intro_java.classe;

public class Personnage {
    private String nom;
    private int vie;
    private int defense;

    private int attaque;

    public Personnage(){};
    public Personnage(String nom, int vie, int defense, int attaque){
        this.nom = nom;
        this.vie = vie;
        this.attaque = attaque;
        this.defense = defense;
    };


    public String getNom() {
        return nom;
    }

    public int getVie() {
        return vie;
    }

    public int getDefense() {
        return defense;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setVie(int vie) {
        this.vie = vie;

    }

    public void setDefense(int defense) {
        this.defense = defense;
    }


    public int getAttaque() {
        return attaque;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }
    public void attaquer(Personnage personnage){
        if( this.getAttaque() < personnage.getDefense() )
        {
           personnage.setVie(personnage.getVie());


        }
        else {
           personnage.setVie(personnage.getVie() - (this.getAttaque() - personnage.getDefense()));

        }
    }

}
