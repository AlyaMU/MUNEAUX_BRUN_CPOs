/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_muneaux_gomez;

/**
 *
 * @author Alya
 */
public class Grille {
    // Attributs :
    
    Cellule [][]CellulesJeu = new Cellule[6][7]; // On crée le plateau de jeu, 6 lignes et 7 colonnes
    
    // Méthodes :
    
    public Grille() {
        for(int i = 0; i < 6; i++) { // On initialise une grille de cases vides
            for (int j = 0; j < 7; j ++) {
                CellulesJeu[i][j] = new Cellule();
            }
        }
    }
    
    boolean ajouterJetonDansColonne(Jeton unJeton, int uneColonne) { 
        // On cherche à ajouter un jeton dans une colonne choisie
        Jeton ligneTest;
        boolean resultat = false;
        if ((uneColonne >= 0) && (uneColonne < 7)) { // On vérifie que la colonne est dans les 7 existantes
            for (int i = 0; i < 6; i++) { // On teste les différentes lignes de la colonne choisie
                ligneTest = CellulesJeu[i][uneColonne].jetonCourant;
                if (ligneTest == null) { // Cas ou la case testée est vide
                    CellulesJeu[i][uneColonne].affecterJeton(unJeton);
                    resultat = true;
                    break;
                }
                else if ((i == 5) && (ligneTest != null)) { // Cas où la colonne est remplie
                    System.out.println("La colonne est pleine.");
                    resultat = false;

                }
            }
        }
        else { // Cas ou la colonne n'existe pas
            System.out.println("La colonne choisie n'existe pas.");
            resultat = false;
        }
        return resultat;
    }
    
    boolean etreRemplie() {
        for(int i = 0; i < 6; i++) { // On vérifie chaque case de la grille
            for (int j = 0; j < 7; j ++) {
                if (CellulesJeu[i][j].jetonCourant == null) {
                    return false;
                }
            }
        }
        return true;
    }
    
    void viderGrille() {
        for(int i = 0; i < 6; i++) { // On reinitialise une grille de cases vides
            for (int j = 0; j < 7; j ++) {
                CellulesJeu[i][j] = null;
            }
        }
    }
    
    void afficherGrilleSurConsole() {
        for(int i = 5; i >= 0; i--) {
            System.out.print("\n");
            for (int j = 0; j < 7; j ++) {
                if (CellulesJeu[i][j].trouNoir == true) {
                    System.out.print("\u001B[30m" + "\u2022" + "\u001B[0m");
                }
                else if (CellulesJeu[i][j].jetonCourant == null) {
                    System.out.print("\u001B[37m" + "\u2022" + "\u001B[0m");
                }
                else {
                    String colJeton = CellulesJeu[i][j].jetonCourant.couleur;
                    if (colJeton == "Rouge") {
                    System.out.print("\u001B[31m" + "\u2022" + "\u001B[0m");
                    }
                    else if (colJeton == "Jaune") {
                        System.out.print("\u001B[33m" + "\u2022" + "\u001B[0m");
                    }
                }  
            }
        }
        
    }
    
    boolean celluleOccupee(int uneLigne, int uneColonne) {
        Jeton caseTest = CellulesJeu[uneLigne][uneColonne].jetonCourant;
        if (caseTest != null) {
            return true;
        }
        else {
            return false;
        }
    }
    
    String lireCouleurDuJeton(int uneLigne, int uneColonne) {
        String resultat = CellulesJeu[uneLigne][uneColonne].lireCouleurDuJeton();
        return resultat;
    }
    
    
    boolean etreGagnantePourJoueur(Joueur unJoueur) {
        String couleurJeton = unJoueur.Couleur; // On récupère la couleur des jetons à vérifier
        String couleurCase; // Couleur des jetons sur les cases
        String couleurTest1;
        String couleurTest2;
        String couleurTest3;
        for(int i = 0; i < 6; i++) { // On vérifie chaque case de la grille
            for (int j = 0; j < 7; j ++) {
                couleurCase = CellulesJeu[i][j].lireCouleurDuJeton();
                if (couleurCase == couleurJeton) {
                    // On vérifie s'il y a une ligne gagnante
                    if (j <= 3) { // On délimite la zone où une ligne gagnante est possible
                        couleurTest1 = CellulesJeu[i][j+1].lireCouleurDuJeton();
                        couleurTest2 = CellulesJeu[i][j+2].lireCouleurDuJeton();
                        couleurTest3 = CellulesJeu[i][j+3].lireCouleurDuJeton();
                        if ((couleurCase == couleurTest1) && (couleurCase == couleurTest2) && (couleurCase == couleurTest3)) {
                            System.out.println("Ligne gagnante !");
                            return true;
                        }
                    }
                    // On vérifie s'il y a une colonne gagnante
                    if (i <= 2) {
                        couleurTest1 = CellulesJeu[i+1][j].lireCouleurDuJeton();
                        couleurTest2 = CellulesJeu[i+2][j].lireCouleurDuJeton();
                        couleurTest3 = CellulesJeu[i+3][j].lireCouleurDuJeton();
                        if ((couleurCase == couleurTest1) && (couleurCase == couleurTest2) && (couleurCase == couleurTest3)) {
                            System.out.println("Colonne gagnante !");
                            return true;
                        }
                    }
                    // On vérifie s'il y a une diagonale montante gagnante
                    if ((i <= 2) && (j <= 3)) {
                        couleurTest1 = CellulesJeu[i+1][j+1].lireCouleurDuJeton();
                        couleurTest2 = CellulesJeu[i+2][j+2].lireCouleurDuJeton();
                        couleurTest3 = CellulesJeu[i+3][j+3].lireCouleurDuJeton();
                        if ((couleurCase == couleurTest1) && (couleurCase == couleurTest2) && (couleurCase == couleurTest3)) {
                            System.out.println("Diagonale gagnante !");
                            return true;
                        }
                    }
                    // On vérifie s'il y a une diagonale descendante gagnante
                    if ((i > 3) && (j <= 3)) {
                        couleurTest1 = CellulesJeu[i-1][j+1].lireCouleurDuJeton();
                        couleurTest2 = CellulesJeu[i-2][j+2].lireCouleurDuJeton();
                        couleurTest3 = CellulesJeu[i-3][j+3].lireCouleurDuJeton();
                        if ((couleurCase == couleurTest1) && (couleurCase == couleurTest2) && (couleurCase == couleurTest3)) {
                            System.out.println("Diagonale gagnante !");
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    void tasserGrille(int uneLigne, int uneColonne) { // Position du jeton supprimé
        for (int i = uneLigne + 1 ; i < 6; i++) { // On parcourt chaque ligne au dessus 
            CellulesJeu[i][uneColonne].jetonCourant = CellulesJeu[i-1][uneColonne].jetonCourant;  
        }
    }
    
    boolean colonneRemplie(int uneColonne) {
        Cellule colonneTest;
        for (int i = 0; i < 6; i++) {
            colonneTest = CellulesJeu[i][uneColonne];
            if (colonneTest == null) {
                return false;
            }
        }
        return true;
    }
    
    boolean placerTrouNoir(int uneLigne, int uneColonne) {
        boolean resultat;
        resultat = CellulesJeu[uneLigne][uneColonne].placerTrouNoir();
        return resultat;
    }
    
    boolean placerDesintegrateur(int uneLigne, int uneColonne) {
        boolean resultat;
        resultat = CellulesJeu[uneLigne][uneColonne].placerDesintegrateur();
        return resultat;
    }
    
    boolean supprimerJeton(int uneLigne, int uneColonne) {
        boolean resultat;
        resultat = CellulesJeu[uneLigne][uneColonne].supprimerJeton();
        return resultat;
    }
    
    void recupererJeton(int uneLigne, int uneColonne) {
        CellulesJeu[uneLigne][uneColonne].recupererJeton();
    }
}
