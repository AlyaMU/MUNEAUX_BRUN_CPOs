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

    public Joueur(String UnNom){ // On initialise le nom du joueur
        Nom = UnNom;
    }

    void affecterCouleur(String uneCouleur){ // On affecte la couleur en paramètre au joueur
           Couleur = uneCouleur;
    }

    void ajouterJeton(Jeton unJeton){ // On cherche à ajouter un jeton à la liste
        for(int i=0 ; i<21 ; i++){
            if(ListeJetons[i]==null){ // On cherche une case vide du tableau listant les jetons
                ListeJetons[i]= unJeton;
                nombreJetonsRestants = i  ; // On redéfinit le nombre de jeton restants
                break;
            }
        }

    }


    void obtenirDesintegrateur(){ // Incrémentation du nombre de désintégrateurs
        nombreDesintegrateurs = nombreDesintegrateurs + 1;
    }

    boolean utiliserDesintegrateur(){ // On enlève un désintégrateur

        boolean Desin;
        if (nombreDesintegrateurs !=0){
            nombreDesintegrateurs = nombreDesintegrateurs -1;
            Desin = true;
            return Desin;
        }
        else {
            Desin = false;
            return Desin;
        }
    }
}
