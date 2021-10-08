/*
 * Alya MUNEAUX, Nathanael GOMEZ TDC
 * TP1 : syntaxe de base
 * Exo2 : guess my number
 */
package tp1_guessmynumber_muneaux_gomez;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alya
 */
public class TP1_guessMyNumber_MUNEAUX_GOMEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        int choixnb = generateurAleat.nextInt(100);
        int nb = 0;
        int compteur = 0;
        boolean resultat = false;
        int niveau;
        System.out.println("Bonjour, choisissez un mode de difficulté :");
        System.out.println("1) Facile \n 2) Normal \n 3) Difficile ");
        Scanner valEntier = new Scanner(System.in);
        niveau = valEntier.nextInt();
        switch (niveau) {
            case 1 :
                while (resultat != true) {
                    Scanner ChoixNb = new Scanner(System.in);
                    System.out.println("Saisissez une valeur :");
                    nb = ChoixNb.nextInt();
                        if (nb == choixnb) {
                            System.out.println("Gagné !");
                            resultat = true;
                        }
                        if (nb > choixnb) {
                            System.out.println("Trop grand");
                        }
                        if (nb < choixnb) {
                            System.out.println("Trop petit");
                        }
                    compteur += 1;
                }
                break;
            case 2 :
                while (compteur < 20) {
                    Scanner ChoixNb = new Scanner(System.in);
                    System.out.println("Saisissez une valeur :");
                    nb = ChoixNb.nextInt();
                        if (nb == choixnb) {
                            System.out.println("Gagné !");
                        }
                        if (nb > choixnb) {
                            System.out.println("Trop grand");
                        }
                        if (nb < choixnb) {
                            System.out.println("Trop petit");
                        }
                    compteur += 1;
                }
                break;
            case 3 :
                while (compteur < 10) {
                    Scanner ChoixNb = new Scanner(System.in);
                    System.out.println("Saisissez une valeur :");
                    nb = ChoixNb.nextInt();
                        if (nb == choixnb) {
                            System.out.println("Gagné !");
                            resultat = true;
                        }
                        if (nb > choixnb) {
                            System.out.println("Trop grand");
                        }
                        if (nb < choixnb) {
                            System.out.println("Trop petit");
                        }
                    compteur += 1;
                break;
                }
        System.out.println("Nombre de tentatives " + compteur);      
    }   
}
