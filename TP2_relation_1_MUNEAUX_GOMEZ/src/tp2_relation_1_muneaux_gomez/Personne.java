/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_muneaux_gomez;

/**
 *
 * @author Alya
 */
public class Personne {
    // Attributs :
    
    String nom;
    String prenom;
    int nbVoitures ; 
    Voiture [] liste_voitures ; 
    
    // Méthodes :
    
    @Override 
    public String toString() {
        String chaine_a_retourner; 
        chaine_a_retourner = ("Nom : " + nom + "\n Prénom : " + prenom);
        return chaine_a_retourner;
    }
    
    public boolean ajouter_voiture( Voiture voiture_a_ajouter) { 
        if (voiture_a_ajouter.Proprietaire != null) {
            return false;
        }
        else if (nbVoitures == 3) {
            return false;
        }
        else {
            liste_voitures[nbVoitures] = voiture_a_ajouter;
            nbVoitures += 1;
            voiture_a_ajouter.Proprietaire = this;
            return true;
        }
    }
    
    // Constructeurs :
    
    public Personne(String unNom, String unPrenom) {
        nom = unNom;
        prenom = unPrenom;
        liste_voitures = new Voiture [3];
        nbVoitures = 0;
    }
}
