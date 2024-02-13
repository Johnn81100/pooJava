package com.intro_java.classe;

import com.intro_java.interfaces.Competence;

public class Superman extends Personnage implements Competence {
    private int bonusVie;
    public Superman(String nom, int vie, int defense, int attaque, int bonusVie){
        super(nom,vie,defense,attaque);
        this.bonusVie= bonusVie;
    }

    public int getBonusVie() {
        return bonusVie;
    }

    public void setBonusVie(int bonusVie) {
        this.bonusVie = bonusVie;
    }

    @Override
    public void attaquer(Personnage cible){
        this.setVie(this.getVie()+this.bonusVie);
        cible.setVie(cible.getVie()-(this.getAttaque()-cible.getDefense()));
        System.out.println(this.getVie());
    }
}
