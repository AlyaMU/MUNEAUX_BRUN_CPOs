/*
 * Alya MUNEAUX, Nathanael GOMEZ TDC
 * TP1 : syntaxe de base
 * Exo1 : saisie et manipulation de nombres
 */
package tp1_manipnombresint_muneaux;

import java.util.Scanner;

/**
 *
 * @author Alya
 */
public class TP1_manipNombresInt_MUNEAUX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int entier1 = 0;
        int entier2 = 0;
        int quotient = 0;
        int reste = 0;
        Scanner valEntier1 = new Scanner(System.in);
        System.out.println("\n Entrez une valeur entière :");
        entier1 = valEntier1.nextInt(); // on demande a valEntier1 de donner le prochain entier
        Scanner valEntier2 = new Scanner(System.in);
        System.out.println("\n Entrez une valeur entière :");
        entier2 = valEntier2.nextInt(); // on demande a valEntier2 de donner le prochain entier
        System.out.println("La première valeur est : " + entier1);
        System.out.println("La deuxième valeur est : " + entier2);
        quotient = entier1/entier2;
        reste = entier1%entier1;
        System.out.println("Le quotient est : " + quotient);
        System.out.println("Le reste est : " + reste);
    }
    
}
