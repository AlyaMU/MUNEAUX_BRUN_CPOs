/*
* Alya MUNEAUX, Nathanael GOMEZ TDC
* TP0 Présentation de Netbeans Exo1
 */
package exo1;

import java.util.Scanner;

/**
 *
 * @author Alya
 */
public class TP0_Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bonjour");
        System.out.println("Au revoir");
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prenom ?");
        prenom = sc.nextLine();
        System.out.println("Votre prénom est : " + prenom);
    }
    
}
