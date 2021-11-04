/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_muneaux_gomez;

/**
 *
 * @author Alya
 */
public class Joueur {
    // Attributs : 

    String Nom;
    String Couleur;
    Jeton []ListeJetons = new Jeton[21]; // On crée un tableau de 21 cases pour savoir combien de jetons possède le joueur
    int nombreJetonsRestants;
    int nombreDesintegrateurs;

    // Méthodes : 

    void Joueur(String UnNom){ // On initialise le nom du joueur
        Nom = UnNom;
    }

    void affecterCouleur(String uneCouleur){ // On affecte la couleur en paramètre au joueur
           Couleur = uneCouleur;
    }

    void ajouterJeton(Jeton unJeton){ // On cherche à ajouter un jeton à la liste
        for(int i=0 ; i<21 ; i++){
            if(ListeJetons[i]==null){ // On cherche une case vide du tableau listant les jetons
                ListeJetons[i]= unJeton;
                nombreJetonsRestants = i + 1 ; // On redéfinit le nombre de jeton restants, i + 1 car tableau d'indice 0
                break;
            }
        }

    }
}
