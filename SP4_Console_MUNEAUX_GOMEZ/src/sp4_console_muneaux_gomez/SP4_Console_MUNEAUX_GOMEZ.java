/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sp4_console_muneaux_gomez;

import java.util.Scanner;

/**
 *
 * @author Alya
 */
public class SP4_Console_MUNEAUX_GOMEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Programme principal
        
        // On crée deux joueurs
        System.out.println("Bienvenue ! La partie va commencer.");
        Scanner nomJ1 = new Scanner(System.in);
        System.out.println("Joueur 1, veuillez rentrer votre nom.");
        String nomJoueur1 = nomJ1.nextLine();
        Joueur joueur1 = new Joueur(nomJoueur1);
        Scanner nomJ2 = new Scanner(System.in);
        System.out.println("Joueur 2, veuillez rentrer votre nom.");
        String nomJoueur2 = nomJ2.nextLine();
        Joueur joueur2 = new Joueur(nomJoueur2);
        
        // On crée une partie
        Partie partieEnCours = new Partie(joueur1, joueur2);
        
        // On initialise la partie avant de la lancer
        partieEnCours.attribuerCouleursAuxJoueurs();
        partieEnCours.initialiserPartie();
        partieEnCours.debuterPartie();
    }
    
}
