/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muneaux_brun_lightsout;

/**
 *
 * @author Alya
 */
public class Grille {
    
    // Attributs
    
    Cellule [][]CellulesJeu = new Cellule[5][5]; // On crée le plateau de jeu, 5 lignes et 5 colonnes
    
    // Méthodes
    
    public Grille() {
        for(int i = 0; i < 5; i++) { // On initialise une grille de cases vides
            for (int j = 0; j < 5; j ++) {
                CellulesJeu[i][j] = new Cellule();
            }
        }
    }
    
    void changerCase(int uneLigne, int uneColonne) {
        if (CellulesJeu[uneLigne][uneColonne].etatCellule() == true) {
            CellulesJeu[uneLigne][uneColonne].etat = false;
        }
        else {
            CellulesJeu[uneLigne][uneColonne].etat = true;
        }
    }
    
}
