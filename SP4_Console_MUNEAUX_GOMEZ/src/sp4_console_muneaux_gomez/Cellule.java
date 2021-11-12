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
    
    Jeton jetonCourant; // Référence vers la cellule avec un jeton, ou vide correspondant
    boolean trouNoir; // Indication de la présence d'un trou noir
    boolean desintegrateur; // Indication de la présence d'un désintégrateur

    // Méthodes :
    
    public Cellule() {
        jetonCourant = null; // Initialise la case vide
        trouNoir = false;
        desintegrateur = false;
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
    
    Jeton recupererJeton() {
        return jetonCourant;
    }
    
    boolean supprimerJeton() {
        if (jetonCourant != null) { // Suppression du jeton peut être effectuée car la case est non vide
            jetonCourant = null;
            return true;
        }
        else { // La case est vide, on ne supprime rien
            return false;
        }
    }
    
    boolean placerTrouNoir() {
        if (trouNoir == false) { // On vérifie s'il y a déjà un trou noir
            trouNoir = true;
            return true;
        }
        else {
            return false;
        }
    }
    
    boolean placerDesintegrateur() {
        if (desintegrateur == false) { // On vérfie s'il y a déjà un désintégrateur
            desintegrateur = true;
            return true;
        }
        else {
            return false;
        }
        
    }
    
    boolean presenceTrouNoir() {
        if (trouNoir == true) { // On vérfie s'il y a un trou noir sur la case
            return true;
        }
        else {
            return false;
        }
    }
    
    boolean presenceDesintegrateur() {
        if (desintegrateur == true) { // On vérfie s'il y a un désintégrateur sur la case
            return true;
        }
        else {
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
    
    boolean recupererDesintegrateur() {
        if (desintegrateur == true) { // On vérifie s'il y a un désintégrateur
            desintegrateur = false;
            return true;
        }
        else {
            return false;
        }
    }
    
    boolean activerTrouNoir() { // On vérifie s'il y a un trou noir
        if (trouNoir == true) {
            jetonCourant = null;
            trouNoir = false;
            return true;
        }
        else {
            return false;
        }
    }
}
