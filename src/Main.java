import com.intro_java.classe.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        public static  void main(String[] args) {

            Habitation habitation = new Habitation("maison", 6.00, 5.00, 2);
            Habitation habitation1 = new Habitation("chalet", 7.00, 5.00, 4);
            Habitation habitation2 = new Habitation("cabane", 6.00, 9.00, 1);
            Scanner scanner = new Scanner(System.in);
            System.out.println(habitation.getNom() + "à une surface de :" + habitation.Surface() + "m²");
            System.out.println(habitation1.getNom() + "à une surface de :" + habitation1.Surface() + "m²");
            /* scanner.nextLine();*/
            System.out.println(habitation2.getNom() + "à une surface de :" + habitation2.Surface() + "m²");
            ArrayList<Habitation> listHabition = new ArrayList<>();
            listHabition.add(habitation);
            listHabition.add(habitation1);
            listHabition.add(habitation2);

            for (Habitation hab : listHabition) {
                System.out.println(hab.getNom() + "à une surface de :" + hab.Surface() + "m²");
            }
            Vehicule vehicule = new Vehicule("Ibiza", 4, 180);
            Vehicule vehicule1 = new Vehicule("traffic", 6, 150);
            Vehicule vehicule2 = new Vehicule("trike", 3, 50);
            Vehicule vehicule3 = new Vehicule("ducati", 2, 230);
            Vehicule vehicule4 = new Vehicule("Megane", 4, 180);
            ArrayList<Vehicule> listVehicule = new ArrayList<>();
            listVehicule.add(vehicule);
            listVehicule.add(vehicule1);
            listVehicule.add(vehicule2);
            listVehicule.add(vehicule3);
            listVehicule.add(vehicule4);
            for (Vehicule vec : listVehicule) {
                vec.boost();
                System.out.println(vec.getName() + " est de type " + vec.method());
                System.out.println(vec.getName() + " possède une vitesse de " + vec.getVitesse());
                System.out.println(vec.plusRapide(vehicule3));
            }
            Assassin assassin = new Assassin("Rogue", 1, 1, 1, 0);
            Guerrier guerrier = new  Guerrier("War", 150, 40, 25, 50);
            Partie partie = new Partie( assassin, guerrier,20);
            /*System.out.println( partie.lancerLaPartie());*/
            Flash flash = new Flash("Flash", 150, 40, 500, 1);
            Batman batman = new Batman("Batman", 200, 40, 100,1);
            Superman superman = new Superman("Superman", 200, 40, 25, 1);
          /*  flash.attaquer(batman);
            batman.attaquer(superman);
            superman.attaquer(flash);
            System.out.println(batman.getVie());
            System.out.println(superman.getVie());
            System.out.println(flash.getVie());*/

            Partie partie2 = new Partie( flash, batman,20);
            System.out.println(partie2.lancerLaPartie());








        }



}