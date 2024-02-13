package com.intro_java.classe;

import com.intro_java.interfaces.Competence;

public class Flash extends Personnage implements Competence {
    private int  bonusAttaque;
    public  Flash(String nom, int vie, int defense, int attaque, int bonusAttaque){
        super(nom,vie,defense,attaque);
        this.bonusAttaque= bonusAttaque;
    }

    public int getBonusAttaque() {
        return bonusAttaque;
    }

    public void setBonusAttaque(int bonusAttaque) {
        this.bonusAttaque = bonusAttaque;
    }

    @Override
    public void attaquer(Personnage cible){
        System.out.printf("flash");
        System.out.println(this.getAttaque());
        System.out.println(cible.getDefense());
        if( this.getAttaque() - cible.getDefense() < 0 )
        {
           cible.setVie(cible.getVie());
            System.out.println("attaque négative de flash");
            System.out.println(cible.getVie());


        }
        else {
            System.out.printf("attaque de flash");
            System.out.printf("vie de batman");
            System.out.println(cible.getVie());
            cible.setVie(cible.getVie() - ((this.getAttaque() + this.bonusAttaque) - cible.getDefense()));
            System.out.printf("vie de batman");
            System.out.println(cible.getVie());
        }
    }
}
