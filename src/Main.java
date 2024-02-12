import com.intro_java.classe.Habitation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        public static  void main(String[] args) {
           /* Scanner scanner  = new Scanner(System.in);
            totalNumber(scanner,5,6);*/
           /* lectureDansLaConsole(scanner);*/
          /*  System.out.println(substract(7,6,5));

            System.out.println(average(5,10,7,3));
            System.out.println(reverseNumber(5,10));*/
            /*Exemple test = new Exemple();
            Exemple test1 = new Exemple("Gau","Jonathan", 37);
            System.out.println(test);*/

            Habitation habitation= new Habitation("maison",  6.00 , 5.00);
            Habitation habitation1= new Habitation("chalet",  7.00 , 5.00);
            Habitation habitation2= new Habitation("cabane",  6.00 , 9.00);
            Scanner scanner = new Scanner(System.in);
            System.out.println(habitation.getNom() + "à une surface de :" + habitation.Surface() + "m²");
            /*scanner.nextLine();*/
            System.out.println(habitation1.getNom() + "à une surface de :" + habitation1.Surface() + "m²");
           /* scanner.nextLine();*/
            System.out.println(habitation2.getNom() + "à une surface de :" + habitation2.Surface() + "m²");
            ArrayList<Habitation> listHabition =  new ArrayList<>();
            listHabition.forEach((hab) ->
                    System.out.println(hab.getNom() + "à une surface de :" + hab.Surface() + "m²")

        );


        }

      /*  public static void totalNumber(Scanner scanner, int firstNumber , int secondNumber) {
            System.out.print("Veuillez entrer un nombre : ");
            firstNumber = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Veuillez entrer un nombre : ");
            secondNumber = scanner.nextInt();
            scanner.nextLine();
           Integer totalNumber = firstNumber + secondNumber;
            System.out.print("le résultat est  égal à " + totalNumber);
        }

        public static String substract(Scanner scanner,int nbr1, int nbr2, int nbr3){
            intnbr1 =scanner.nextInt();
            scanner.nextLine();
            intnbr2=scanner.nextInt();
            scanner.nextLine();
            int nbr3=scanner.nextInt();
            scanner.nextLine();
            Integer totalNumber = nbr1 - nbr2 - nbr3;
            System.out.print("le résultat est  égal à " + totalNumber);
        }

        public static String average(int nbr1, int nbr2, int nbr3, int nbr4){
             int[] listNbr = {nbr1, nbr2,nbr3,nbr4};
             int average = (nbr1 + nbr2 + nbr3 + nbr4)/ listNbr.length;
             String result = "le résultat est  égal à " +  average;
             return result.toString();
        }
        public static String reverseNumber(int nbr1, int nbr2){
        int temp = nbr2;
        nbr2 = nbr1;
        nbr1 = temp;
        int[]  listnumber ={nbr1, nbr2};
        String result = "après échange des nombres " +  listnumber[0] + " & " + listnumber[1] ;
        return result.toString();
        }

        public static int lectureDansLaConsole(Scanner scanner){
            System.out.print("Veuillez entrer un nombre : ");
            int nombre = scanner.nextInt();
            scanner.nextLine();
            //affichage dans la console d'un message
            return nombre;

        }*/


}