package com.intro_java.classe;

public class Assassin extends Personnage{

 private int bonusAttaque;

    public int getBonusAttaque() {
        return bonusAttaque;
    }

    public void setBonusAttaque(int bonusAttaque) {
        this.bonusAttaque = bonusAttaque;
    }

    public Assassin(String nom, int vie, int defense, int attaque, int bonusAttaque){
     super(nom, vie,defense,attaque);
     this.bonusAttaque = bonusAttaque;
 }

    public int attaquer(Personnage personnage){
        long random = Math.round(Math.random()*100);
        if(random % 20 == 0) {
            return personnage.getVie() - ((this.getAttaque() + this.getBonusAttaque()) - personnage.getDefense());
        }else {
            return personnage.getVie() - (this.getAttaque() - personnage.getDefense());
        }
    }

}
