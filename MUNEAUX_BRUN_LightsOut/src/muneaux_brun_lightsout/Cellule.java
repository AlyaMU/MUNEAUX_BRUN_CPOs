/*
 * MUNEAUX BRUN Lights Out
 * Projet fin de Semestre 3 2ème année EPF
 */
package muneaux_brun_lightsout;

/**
 *
 * @author Alya
 */
public class Cellule {
    
    // Attributs
    
    boolean etat;
    boolean bonus;
    String couleur; // Plus simple de n'avoir qu'une couleur
    
    // Méthodes
    
    public Cellule() {
        etat = false; // Cellule éteinte
        bonus = false;
        couleur = null;
    }
    
    boolean etatCellule() {
        if (etat == true) {
            //System.out.println("Cellule allumée");
            return true;
        }
        else {
            //System.out.println("Cellule éteinte");
            return false;
        }
    }
    
    boolean presenceBonus() {
        if (bonus == true) {
            return true;
        }
        else {
            return false;
        }
    }
    
    void couleurRouge() {
        couleur = "Rouge";
    }
    
    void couleurJaune() {
        couleur = "Jaune";
    }
}
