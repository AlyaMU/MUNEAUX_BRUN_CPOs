/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
    
    // Méthodes
    
    public Cellule() {
        etat = false; // Cellule éteinte
        bonus = false;
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
}
