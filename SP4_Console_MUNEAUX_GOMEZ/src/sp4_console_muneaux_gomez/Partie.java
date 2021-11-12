/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_muneaux_gomez;

import java.util.Scanner;

/**
 *
 * @author Alya
 */
public class Partie {
    
    
    // Attributs : 
    
    Joueur []ListeJoueurs = new Joueur[2];
    Joueur joueurCourant;
    Grille grilleJeu;
    
    //Méthodes :
    
    void attribuerCouleursAuxJoueurs(){
       joueurCourant.affecterCouleur(joueurCourant.Couleur);
    }
    
    void initialiserPartie(){
       grilleJeu = new Grille(); // On crée la grille vide de début de partie
    }
    
    void debuterPartie(){ 
        int numColonne = 0;
        boolean rescol= false;
        boolean resgrill = false;
        boolean partie = false;
        
        System.out.println("Bienvenue ! La partie va commencer.");
        while (partie!= true){ // La partie dure tant que personne n'a gagné ou que la grille n'est pas pleine
            
        
            while (joueurCourant == ListeJoueurs[1]){ //tour du joueur 1
                Scanner numeroColonne = new Scanner(System.in);
            
                while (rescol!=true){
                
                    while (numColonne<=7 && numColonne>=1){
                        System.out.println(" Dans quelles colonnes souhaitez-vous mettre votre Jeton ? (Saisissez un nombre entre 1 et 7) ");
                        numColonne = numeroColonne.nextInt(); // Le joueur choisit la colonne dans laquelle il place le jeton, on vérifie bien que la colonne existe
                    }
            
                    //rescol = grilleJeu.ajouterJetonDansColonne(jetonCourant, numColonne); // On vérifie que la colonne n'est pas pleine
                }
                resgrill = grilleJeu.etreRemplie(); // On vérifie si la grille est pleine
                if (resgrill == true){
                    break;
                }
                joueurCourant = ListeJoueurs[2]; // On finit son tour en passant la main au 2eme joueur
                
            }
            
            while (joueurCourant == ListeJoueurs[2]){
                  Scanner numeroColonne = new Scanner(System.in);

                  while (rescol!=true){

                      while (numColonne<=7 && numColonne>=1){
                          System.out.println("Dans quelles colonnes souhaitez-vous mettre votre Jeton ? (Saisissez un nombre entre 1 et 7) ");
                          numColonne = numeroColonne.nextInt(); 
                      }

                      //rescol = grilleJeu.ajouterJetonDansColonne(jetonCourant, numColonne); 
                  }
                  resgrill = grilleJeu.etreRemplie();
                  if (resgrill == true){
                      break;
                  }
                joueurCourant = ListeJoueurs[1];
             }
        }
        grilleJeu.viderGrille(); // On vide la grille à la fin de la partie
    
    }
}
