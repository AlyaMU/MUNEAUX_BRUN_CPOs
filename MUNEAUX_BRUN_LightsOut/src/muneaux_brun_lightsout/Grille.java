/*
 * MUNEAUX BRUN Lights Out
 * Projet fin de Semestre 3 2ème année EPF
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
        for(int i = 0; i < 5; i++) { // On initialise une grille de cases vides et éteintes
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
    
    boolean grilleGagnante() {
        for(int i = 0; i < 5; i++) { // On vérifie les cases de la grille
            for (int j = 0; j < 5; j ++) {
                if (CellulesJeu[i][j].etatCellule() == true) {
                    return false;
                }
            }
        }
        return true;
    }
    
    void afficherGrilleSurConsole() {
        for(int i = 4; i >= 0; i--) {
            System.out.print("\n");
            for (int j = 0; j < 5; j ++) {
                if (CellulesJeu[i][j].etatCellule() == true) {
                    System.out.print("\u001B[0;47m" + "\u001B[1;34m" + "\u2022" + "\u001B[0m"); 
                }
                else {
                    System.out.print("\u001B[0;47m" + "\u001B[1;31m" + "\u2022" + "\u001B[0m");
                }
            }
        }   
    }
    
    void bonusLigne(int uneLigne) {
        for (int i = 0; i<5; i++) {
            if (CellulesJeu[uneLigne][i].etatCellule() == true) {
                CellulesJeu[uneLigne][i].etat = false;
            }
        }
    }
    
    void bonusColonne(int uneColonne) {
        for (int i = 0; i<5; i++) {
            if (CellulesJeu[i][uneColonne].etatCellule() == true) {
                CellulesJeu[i][uneColonne].etat = false;
            }
        }
    }
    
}
