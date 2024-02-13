package com.intro_java.classe;

import com.intro_java.interfaces.Competence;

public class Flash extends Personnage implements Competence {
    public  Flash(String nom, int vie, int defense, int attaque){
        super(nom,vie,defense,attaque);
    }
    @Override
    public void attaquer(Personnage cible){
        cible.setVie(cible.getVie()-(this.getAttaque()-cible.getDefense()));
    }
}
