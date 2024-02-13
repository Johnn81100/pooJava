package com.intro_java.classe;

public class Partie  {

    private Personnage joueur1;
    private Personnage joueur2;
    private  int nbreDeTour;

    public Partie(){}
    public Partie(Personnage joueur1, Personnage joueur2, int nbreDeTour){
        this.joueur1= joueur1;
        this.joueur2= joueur2;
        this.nbreDeTour = nbreDeTour;
    }
    public Personnage getJoueur1() {
        return joueur1;
    }

    public void setJoueur1(Personnage joueur1) {
        this.joueur1 = joueur1;
    }

    public Personnage getJoueur2() {
        return joueur2;
    }

    public void setJoueur2(Personnage joueur2) {
        this.joueur2 = joueur2;
    }

    public int getNbreDeTour() {
        return nbreDeTour;
    }

    public void setNbreDeTour(int nbreDeTour) {
        this.nbreDeTour = nbreDeTour;
    }

    public  String lancerLaPartie(){
        while ( this.nbreDeTour > 0 ){
            this.joueur1.attaquer(this.joueur2);
            this.joueur2.attaquer(this.joueur1);
            this.nbreDeTour-- ;
            if( this.joueur1.getVie() < 0 || this.joueur2.getVie() < 0){
                this.nbreDeTour = 0;
            }
        }
        if( this.joueur1.getVie() == this.joueur2.getVie()){
            System.out.println("égalité entre" + this.joueur1.getNom() + "et" + this.joueur2.getNom());
            return "égalité entre" + this.joueur1.getNom() + "et" + this.joueur2.getNom();
        } else if (this.joueur1.getVie() > this.joueur2.getVie() ) {

            return "le gagnant est " + this.getJoueur1().getNom();
        }else{
            return "le gagnant est " + this.getJoueur2().getNom();

        }
    }
}
