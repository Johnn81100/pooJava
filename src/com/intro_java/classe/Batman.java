package com.intro_java.classe;

import com.intro_java.interfaces.Competence;

public class Batman extends Personnage implements Competence {

    private int bonusDefense;
    public Batman(String nom, int vie, int defense, int attaque, int bonusDefense){
        super(nom,vie,defense,attaque);
        this.bonusDefense = bonusDefense;
    }

    public int getBonusDefense() {
        return bonusDefense;
    }

    public void setBonusDefense(int bonusDefense) {
        this.bonusDefense = bonusDefense;
    }

    @Override
    public void attaquer(Personnage cible){
        System.out.println("batman");
        System.out.println(this.getAttaque());
        System.out.println(cible.getDefense());
        if( this.getAttaque() - cible.getDefense() < 0)
        {

            cible.setVie(cible.getVie());
            System.out.println("attaque negative de batman");

        }

        else {
            System.out.println("attaque de batman");

            this.setDefense(this.getDefense() + this.bonusDefense);
            cible.setVie(cible.getVie() - (this.getAttaque() - cible.getDefense()));



        }
    };

}
