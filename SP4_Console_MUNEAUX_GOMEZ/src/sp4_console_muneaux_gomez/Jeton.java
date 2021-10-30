/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_muneaux_gomez;

/**
 *
 * @author Alya
 */
public class Jeton {
    // Attributs :
    
    String couleur; // Couleur affectée au joueur : rouge ou jaune
    
    // Constructeurs :
    
    public Jeton(String uneCouleur) { 
        // On affecte au jeton une des deux couleurs rentrée par le joueur 
         if (uneCouleur == "Rouge") { // Cas ou la couleur est rouge
             couleur = "Rouge";
         }
         else if (uneCouleur == "Jaune") { // Cas ou la couleur est jaune
             couleur = "Jaune";
         }
         else { // Cas ou ni rouge ni jaune : on affecte automatiquement le rouge
             couleur = "Rouge";
         }
    }
    
    // Méthodes :
    
    String lireCouleur() { // On renvoie au joueur la couleur de son jeton
        System.out.println("La couleur des jetons est : " + couleur);
        return couleur;
    }
}
