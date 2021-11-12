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
    
    public Partie(Joueur unJoueur1, Joueur unJoueur2) {
        ListeJoueurs[0] = unJoueur1;
        ListeJoueurs[1] = unJoueur2;
        joueurCourant = ListeJoueurs[0];
    }
    
    void attribuerCouleursAuxJoueurs(){
      int nbale;
      nbale= (int)(Math.random()*100); // On définit un nombre au hasard entre 1 et 100
      if (nbale%2 == 0){ // Si le nombre est pair, le joueur 1 a les rouges et le joueur 2 les jaunes
          ListeJoueurs[0].affecterCouleur("Rouge");
          ListeJoueurs[1].affecterCouleur("Jaune");
      }
      else {
          ListeJoueurs[0].affecterCouleur("Jaune");
          ListeJoueurs[1].affecterCouleur("Rouge");
      }
    }
    
    void initialiserPartie(){
       grilleJeu = new Grille(); // On crée la grille vide de début de partie
       
       for(int i=0;i<21;i++){ // On crée les 21 jetons de chaque couleur pour les joueurs
           if(ListeJoueurs[0].Couleur=="Rouge"){
              Jeton JetonJoueur1 = new Jeton("Rouge");
              ListeJoueurs[0].ajouterJeton(JetonJoueur1); // On ajoute chaque jeton à la liste de jetons du joueur
              
              Jeton JetonJoueur2 = new Jeton("Jaune");
              ListeJoueurs[1].ajouterJeton(JetonJoueur2);
           }
           
           if(ListeJoueurs[0].Couleur == "Jaune"){
               Jeton JetonJoueur1 = new Jeton("Jaune");
               ListeJoueurs[0].ajouterJeton(JetonJoueur1);
               
               Jeton JetonJoueur2 = new Jeton("Rouge");
               ListeJoueurs[1].ajouterJeton(JetonJoueur2);
           }
           ListeJoueurs[1].nombreJetonsRestants = 21;
           ListeJoueurs[0].nombreJetonsRestants = 21;
       }
       
    }
    
    void debuterPartie(){ 
        int numColonne = 4;
        boolean rescol = false;
        boolean resgrill;
        boolean partie = false;
        boolean gagnant;
        int nbJetons;
        System.out.println("Bienvenue ! La partie va commencer.");
        while (partie!= true){ // La partie dure tant que personne n'a gagné ou que la grille n'est pas pleine
            while (joueurCourant == ListeJoueurs[0]){ // Tour du joueur 1
                System.out.println("\n C'est au tour du Joueur 1");
                while (rescol!=true){ // On réessaye d'ajouter le jeton tant que son placement sur la grille n'est pas valide
                    System.out.println("Choix de la colonne");
                    Scanner numeroColonne = new Scanner(System.in);
                    System.out.println(" Dans quelle colonne souhaitez-vous mettre votre Jeton ? (Saisissez un nombre entre 0 et 6) ");
                    numColonne = numeroColonne.nextInt(); // Le joueur choisit la colonne dans laquelle il place le jeton, on vérifie bien que la colonne existe
                    if ((numColonne >= 0) && (numColonne < 7)) {
                        nbJetons = ListeJoueurs[0].nombreJetonsRestants;
                        rescol = grilleJeu.ajouterJetonDansColonne(ListeJoueurs[0].ListeJetons[nbJetons-1], numColonne); 
                        // On vérifie que la colonne n'est pas pleine et on ajoute, rescol récupère si l'ajout s'est bien passé
                    }       
                }
                System.out.println("Fin choix colonne");
                resgrill = grilleJeu.etreRemplie(); // On vérifie si la grille est pleine
                if (resgrill == true){
                    System.out.println("Fin de partie, la grille est pleine.");
                    partie = true;
                }
                gagnant = grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0]); // On vérifie si la grille est gagnante pour le joueur 1
                if (gagnant == true){
                    System.out.println("VICTOIRE DU JOUEUR 1 !");
                    partie = true;
                }
                rescol = false; // On réinitialise pour les prochains tours
                grilleJeu.afficherGrilleSurConsole();
                joueurCourant = ListeJoueurs[1]; // On finit son tour en passant la main au 2eme joueur
                
            }
            
            while (joueurCourant == ListeJoueurs[1]){ // Tour du joueur 2
                System.out.println("\n C'est au tour du Joueur 2");
                while (rescol!=true){
                    System.out.println("Choix de la colonne");
                    Scanner numeroColonne = new Scanner(System.in);
                    System.out.println("Dans quelle colonne souhaitez-vous mettre votre Jeton ? (Saisissez un nombre entre 0 et 6) ");
                    numColonne = numeroColonne.nextInt(); 
                    if ((numColonne >= 0) && (numColonne < 7)) {
                        nbJetons = ListeJoueurs[1].nombreJetonsRestants;
                        rescol = grilleJeu.ajouterJetonDansColonne(ListeJoueurs[1].ListeJetons[nbJetons -1], numColonne);
                    }
                }
                System.out.println("Fin choix colonne");
                resgrill = grilleJeu.etreRemplie();
                if (resgrill == true){
                    System.out.println("Fin de partie, la grille est pleine.");
                    partie = true;
                } 
                gagnant = grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1]);
                if ( gagnant == true){
                    System.out.println("VICTOIRE DU JOUEUR 2 !");
                    partie = true;
                }
                rescol = false;
                grilleJeu.afficherGrilleSurConsole();
                joueurCourant = ListeJoueurs[0]; // On repasse la main au joueur 1
            }
        }
        grilleJeu.viderGrille(); // On vide la grille à la fin de la partie
    
    }
}
