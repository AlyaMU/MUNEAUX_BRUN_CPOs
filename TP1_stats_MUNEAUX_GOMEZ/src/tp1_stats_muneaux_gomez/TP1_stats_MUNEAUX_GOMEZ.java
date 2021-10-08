/*
 * Alya MUNEAUX, Nathanael GOMEZ TDC
 * TP1 : syntaxe de base
 * Exo4 : statistiques
 */
package tp1_stats_muneaux_gomez;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alya
 */
public class TP1_stats_MUNEAUX_GOMEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        double [] tabEntiers = new double[6];
        int m;
        double rep;
        Scanner valEntier = new Scanner(System.in);
        System.out.println("Saisissez une valeur :");
        m = valEntier.nextInt();
        for (int i = 0 ; i < m ; i++) {
            int resultat = generateurAleat.nextInt(5);
            tabEntiers[resultat] += 1;
        }
        for (int j = 0 ; j < tabEntiers.length ; j++) {
            rep = (tabEntiers[j]/m)*100;
            System.out.println("Case " + j + " : " + rep + " %");
        }
    }
    
}
