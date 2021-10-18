/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_muneaux_gomez;

/**
 *
 * @author Alya
 */
public class BouteilleBiere {
    // Attributs :
    String nom;
    float degreAlcool;
    String brasserie;
    boolean ouverte;
    
    // Méthodes :
    void lireEtiquette() { 
        System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ;  
    } 
    boolean decapsuler() {
        if (ouverte == false) {
            ouverte = true;
            return true;
        }
        else {
            System.out.println("Erreur : la bière est déjà ouverte");
            return false;
        }
    }
    @Override 
    public String toString() { 
    String chaine_a_retourner; 
    chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";   
    if (ouverte == true ) chaine_a_retourner += "oui" ; 
    else chaine_a_retourner += "non" ; 
    return chaine_a_retourner ;  
    }
    // Constructeur :
    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) { 
        nom = unNom; 
        degreAlcool = unDegre; 
        brasserie = uneBrasserie; 
        ouverte = false; 
     }
}

