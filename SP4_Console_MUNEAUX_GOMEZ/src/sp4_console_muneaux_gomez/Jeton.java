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
    
    String couleur;
    
    // Constructeurs :
    
    public Jeton(String uneCouleur) {
         if (uneCouleur == "Rouge") {
             couleur = "Rouge";
         }
         else if (uneCouleur == "Jaune") {
             couleur = "Jaune";
         }
         else {
             couleur = "Rouge";
         }
    }
    
    // Méthodes :
    
    String lireCouleur() {
        System.out.println("La couleur des jetons est : " + couleur);
        return couleur;
    }
}
