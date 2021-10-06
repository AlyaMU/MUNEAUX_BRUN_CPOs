/*
* Alya MUNEAUX TDC
* TP0 Présentation de Netbeans Exo3
 */
package tp0_exo3;

import java.util.Scanner;

/**
 *
 * @author Alya
 */
public class TP0_Exo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the operator \n 1) add \n 2) substract \n 3) multiply \n 4) divide \n 5) modulo");
        int operateur;
        int operande1;
        int operande2;
        int resultat = 0;
        Scanner valEntier = new Scanner(System.in);
        System.out.println("\n Entrez une valeur entière :");
        operateur = valEntier.nextInt(); // on demande a valEntier de donner le prochain entier
        if ((operateur == 0) || (operateur > 5)) {
            System.out.println("Votre opérateur est erroné");
            System.exit(0);
        }
        Scanner ope1 = new Scanner(System.in);
        System.out.println("\n Entrez une première valeur :");
        operande1 = ope1.nextInt();
        Scanner ope2 = new Scanner(System.in);
        System.out.println("\n Entrez une deuxième valeur :");
        operande2 = ope2.nextInt();
        switch(operateur) {
            case 1 -> resultat = operande1 + operande2;
            case 2 -> resultat = operande1 - operande2;
            case 3 -> resultat = operande1 * operande2;
            case 4 -> resultat = operande1 / operande2;
                
        }
        System.out.println("Le résultat est : " + resultat);
    }
    
}
