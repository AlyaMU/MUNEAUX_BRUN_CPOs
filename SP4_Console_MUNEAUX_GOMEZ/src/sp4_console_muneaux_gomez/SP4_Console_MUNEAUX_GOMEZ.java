/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sp4_console_muneaux_gomez;

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
        Joueur joueur1 = new Joueur();
        Joueur joueur2 = new Joueur();
        
        // On crée une partie
        Partie partieEnCours = new Partie();
        partieEnCours.ListeJoueurs[0] = joueur1;
        partieEnCours.ListeJoueurs[1] = joueur2;
        
        // On initialise la partie avant de la lancer
    }
    
}
