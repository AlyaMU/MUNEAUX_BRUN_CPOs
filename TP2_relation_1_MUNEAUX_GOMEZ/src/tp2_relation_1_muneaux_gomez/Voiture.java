/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_muneaux_gomez;

/**
 *
 * @author Alya
 */
public class Voiture {
    // Attributs :
    
    String modele;
    String marque;
    int puissanceCV;
    Personne Proprietaire;
    
    // Méthodes :
    
    @Override 
    public String toString() {
        String chaine_a_retourner; 
        chaine_a_retourner = ("Modele : " + modele + "\n Marque : " + marque + "\n Puissance : " + puissanceCV);
        return chaine_a_retourner;
    }
    
    // Constructeurs :
    
    public Voiture(String unModele, String uneMarque, int unePuissance) {
        modele = unModele;
        marque = uneMarque;
        puissanceCV = unePuissance;
        Proprietaire = null;
    }
}
