package com.intro_java.classe;

public class Guerrier extends Personnage {
    private int bonusDefense;

    public Guerrier(String nom, int vie, int defense, int attaque, int bonusDefense){
        super(nom, vie,defense,attaque);
        this.bonusDefense = bonusDefense;
    }

    public int getBonusDefense() {
        return bonusDefense;
    }

    public void setBonusDefense(int bonusDefense) {
        this.bonusDefense = bonusDefense;
    }
    public int attaquer(Personnage personnage){
        long random = Math.round(Math.random()*100);
        if(random % 20 == 0) {
            this.setVie(this.getVie()+ getBonusDefense());
        }
            return personnage.getVie() - (this.getAttaque() - personnage.getDefense());

    }

}
