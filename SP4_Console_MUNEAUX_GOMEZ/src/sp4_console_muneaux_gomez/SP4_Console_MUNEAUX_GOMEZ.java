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
        
        // Tests intermédiaires
        
        
        Jeton jeton1 = new Jeton("Rouge");
        Jeton jeton2 = new Jeton("Jaune");
        Grille grilleJeu = new Grille();
        grilleJeu.ajouterJetonDansColonne(jeton2, 6);
        grilleJeu.ajouterJetonDansColonne(jeton1, 0);
        grilleJeu.ajouterJetonDansColonne(jeton1, 1);
        grilleJeu.ajouterJetonDansColonne(jeton1, 2);
        grilleJeu.ajouterJetonDansColonne(jeton1, 3);
        joueur1.Couleur = "Rouge";
        boolean placement = grilleJeu.placerTrouNoir(2, 4);
        System.out.println("Le placement est : " + placement);
        grilleJeu.etreGagnantePourJoueur(joueur1);
        grilleJeu.afficherGrilleSurConsole();
    }
    
}
