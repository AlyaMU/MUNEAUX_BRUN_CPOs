/*
* Alya MUNEAUX, Nathanel GOMEZ TDC
* TP0 Présentation de Netbeans Exo2
 */
package tp0_exo2;

import java.util.Scanner;

/**
 *
 * @author Alya
 */
public class TP0_Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Déclaration des variables
          int nb; // nombre d'entiers à additionner
          // nb = 5;
          int result; // resultat
          int ind; // indice
          Scanner sc = new Scanner(System.in);
          System.out.println("\n Entrer le nombre :");
          nb = sc.nextInt(); // on demande a sc de donner le prochain entier
          result = 0;
          
          // Addition des nb premiers entiers
          ind = 1;
          while (ind <= nb) {
              result = result + ind;
              ind += 1;
          }
          // Affichage du resultat
          System.out.println();
          System.out.println("La somme des " + nb + " entiers est: " + result);
    }
    
}
