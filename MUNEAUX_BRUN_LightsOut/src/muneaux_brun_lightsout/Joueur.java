/*
 * MUNEAUX BRUN Lights Out
 * Projet fin de Semestre 3 2ème année EPF
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
    int nbbonus;
    
    // Constructeur
    
    public Joueur(){
       nbcoups = 0;
        nbbonus = 0; 
    }
    
    // Méthodes
    
    void augmenterCoups(){
        nbcoups += 1;
    }
    
    void ajouterBonus() {
        nbbonus += 1;
    }
}
