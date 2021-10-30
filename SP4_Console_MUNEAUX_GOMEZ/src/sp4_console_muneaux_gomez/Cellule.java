/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_muneaux_gomez;

/**
 *
 * @author Alya
 */
public class Cellule {
    // Attributs :
    
    Jeton jetonCourant; // Rférence vers la cellule avec un jeton, ou vide correspondant

    // Méthodes :
    
    public Cellule() {
        jetonCourant = null; // Initialise la case vide
    }
    
    boolean affecterJeton(Jeton unJeton) { // On essaye d'ajouter un jeton sur une case
        if (jetonCourant == null) { // Ajout du jeton peut être effectué car la case est vide
            jetonCourant = unJeton;
            return true;
        }
        else { // La case est déjà remplie, on ne change rien
            return false;
        }
        
    }
    
    String lireCouleurDuJeton() { // On récupère la couleur du jeton 
        String couleurJ;
        if (jetonCourant != null) { // Si il y a un jeton, on lit sa couleur
            couleurJ = jetonCourant.lireCouleur();
            return couleurJ;
        }
        else { // Si la case est vide, on renvoie le mot vide
            couleurJ = "Vide"; 
            return couleurJ;
        }
    }
    
}
