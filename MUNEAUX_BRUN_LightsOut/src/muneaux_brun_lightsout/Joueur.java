/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muneaux_brun_lightsout;

/**
 *
 * @author Alya
 */
public class Joueur {
    
    // Attributs
    
    String nom;
    int nbcoups;
    
    // Constructeur
    
    public Joueur(String unNom) {
        nom = unNom;
        nbcoups = 0;
    }
    
    // Méthodes
    
    void augmenterCoups(){
        nbcoups += 1;
    }
}
