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
       
       int colHasard;
       int ligneHasard;
       for (int i = 0 ; i < 3 ; i++) {
           colHasard = (int)(Math.random()*6); // On définit un nombre au hasard entre 0 et 6
           ligneHasard = (int)(Math.random()*5); 
           grilleJeu.placerDesintegrateur(ligneHasard, colHasard);
       }
       
       for (int i = 0 ; i < 3 ; i++) {
           colHasard = (int)(Math.random()*6); // On définit un nombre au hasard entre 0 et 6
           ligneHasard = (int)(Math.random()*5); 
           grilleJeu.placerTrouNoir(ligneHasard, colHasard);
       }
       
    }
    
    void debuterPartie(){ 
        int numColonne = 4;
        int numLigne;
        boolean rescol = false;
        boolean resgrill;
        boolean partie = false;
        boolean gagnant;
        int nbJetons;
        int ligneJetonPlace = 0;
        System.out.println("Bienvenue ! La partie va commencer.");
        grilleJeu.afficherGrilleSurConsole();
        while (partie!= true){ // La partie dure tant que personne n'a gagné ou que la grille n'est pas pleine
            while (joueurCourant == ListeJoueurs[0]){ // Tour du joueur 1
                System.out.println("\n C'est au tour du Joueur 1");
                Scanner choixAction = new Scanner(System.in);
                System.out.println("Souhaitez vous : \n 1/Placer un jeton ? \n 2/Récupérer un jeton ? \n 3/ Utiliser un désintégrateur ?");
                int action = choixAction.nextInt();
                switch (action) {
                    case 1 :
                        System.out.println("Ajout d'un jeton");
                        while (rescol!=true){ // On réessaye d'ajouter le jeton tant que son placement sur la grille n'est pas valide
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
                        for (int i = 0; i < 6; i++) { // On trouve la ligne où le jeton a été placé
                            boolean testRemplie = grilleJeu.colonneRemplie(numColonne);
                            if (testRemplie == true) {
                                ligneJetonPlace = 5;
                                break;
                            }
                            else {
                                boolean testCellule1 = grilleJeu.celluleOccupee(i, numColonne);
                                boolean testCellule2 = grilleJeu.celluleOccupee(i+1, numColonne);
                                if ((testCellule1 == true) && (testCellule2 == false)) {
                                    ligneJetonPlace = i;
                                    break;
                                }
                            }   
                        }
                        System.out.println("Ligne du jeton placé : " + ligneJetonPlace);
                        Cellule testTrouNoir = grilleJeu.CellulesJeu[ligneJetonPlace][numColonne];
                        Cellule testDesintegrateur = grilleJeu.CellulesJeu[ligneJetonPlace][numColonne];
                        boolean recupDesintegrateur;
                        if (testDesintegrateur.presenceDesintegrateur() == true) {
                            System.out.println("Vous avez trouvé un désintégrateur !");
                            recupDesintegrateur = testDesintegrateur.recupererDesintegrateur();
                            if (recupDesintegrateur == true) {
                                joueurCourant.obtenirDesintegrateur();
                            }
                        }
                        if (testTrouNoir.presenceTrouNoir() == true) {
                            System.out.println("Votre jeton s'est fait avaler par un trou noir");
                            testTrouNoir.activerTrouNoir();
                        }
                        grilleJeu.tasserGrille(ligneJetonPlace, numColonne);
                        break;
                    case 2 :
                        System.out.println("Récupération d'un jeton");
                        Scanner numeroColonne = new Scanner(System.in);
                        System.out.println(" Dans quelle colonne souhaitez-vous récupérer votre Jeton ? (Saisissez un nombre entre 0 et 6) ");
                        numColonne = numeroColonne.nextInt();
                        Scanner numeroLigne = new Scanner(System.in);
                        System.out.println(" Dans quelle colonne souhaitez-vous récupérer votre Jeton ? (Saisissez un nombre entre 0 et 5) ");
                        numLigne = numeroLigne.nextInt();
                        if ((numLigne >= 0) && (numLigne < 6)) {
                            if ((numColonne >= 0) && (numColonne < 7)) {
                                Jeton recupJeton = grilleJeu.recupererJeton(numLigne, numColonne);
                                joueurCourant.ajouterJeton(recupJeton);
                                boolean jetonSup = grilleJeu.supprimerJeton(numLigne, numColonne);
                                if (jetonSup == true) {
                                    System.out.println("Fin récupération jeton");
                                }
                            }
                        }
                        grilleJeu.tasserGrille(numLigne, numColonne);
                        break;
                    case 3 :
                        System.out.println("Désintégration d'un jeton");
                        if (joueurCourant.nombreDesintegrateurs != 0) {
                            Scanner nbColonne = new Scanner(System.in);
                            System.out.println(" Dans quelle colonne souhaitez-vous désintégrer un Jeton ? (Saisissez un nombre entre 0 et 6) ");
                            numColonne = nbColonne.nextInt();
                            Scanner nbLigne = new Scanner(System.in);
                            System.out.println(" Dans quelle colonne souhaitez-vous désintégrer un Jeton ? (Saisissez un nombre entre 0 et 5) ");
                            numLigne = nbLigne.nextInt();
                            if ((numLigne >= 0) && (numLigne < 6)) {
                                if ((numColonne >= 0) && (numColonne < 7)) {
                                    boolean jetonDetruit = grilleJeu.supprimerJeton(numLigne, numColonne);
                                    if (jetonDetruit == true) {
                                        System.out.println("Fin destruction jeton");
                                    }
                                }
                            }
                            grilleJeu.tasserGrille(numLigne, numColonne);
                        }
                        else {
                            System.out.println("Veuillez changer d'action.");
                        }
                        break;
                }
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
                Scanner choixAction = new Scanner(System.in);
                System.out.println("Souhaitez vous : \n 1/Placer un jeton ? \n 2/Récupérer un jeton ? \n 3/ Utiliser un désintégrateur ?");
                int action = choixAction.nextInt();
                System.out.println(action);
                switch (action) {
                    case 1 :
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
                        for (int i = 0; i < 6; i++) { // On trouve la ligne où le jeton a été placé
                            boolean testRemplie = grilleJeu.colonneRemplie(numColonne);
                            if (testRemplie == true) {
                                ligneJetonPlace = 5;
                                break;
                            }
                            else {
                                boolean testCellule1 = grilleJeu.celluleOccupee(i, numColonne);
                                boolean testCellule2 = grilleJeu.celluleOccupee(i+1, numColonne);
                                if ((testCellule1 == true) && (testCellule2 == false)) {
                                    ligneJetonPlace = i;
                                    break;
                                }
                            }   
                        }
                        Cellule testTrouNoir = grilleJeu.CellulesJeu[ligneJetonPlace][numColonne];
                        Cellule testDesintegrateur = grilleJeu.CellulesJeu[ligneJetonPlace][numColonne];
                        boolean recupDesintegrateur;
                        if (testDesintegrateur.presenceDesintegrateur() == true) {
                            System.out.println("Vous avez trouvé un désintégrateur !");
                            recupDesintegrateur = testDesintegrateur.recupererDesintegrateur();
                            if (recupDesintegrateur == true) {
                                joueurCourant.obtenirDesintegrateur();
                            }
                        }
                        if (testTrouNoir.presenceTrouNoir() == true) {
                            System.out.println("Votre jeton s'est fait avaler par un trou noir");
                            testTrouNoir.activerTrouNoir();
                        }
                        grilleJeu.tasserGrille(ligneJetonPlace, numColonne);
                        break;
                    case 2 :
                        System.out.println("Récupération d'un jeton");
                        Scanner numeroColonne = new Scanner(System.in);
                        System.out.println(" Dans quelle colonne souhaitez-vous récupérer votre Jeton ? (Saisissez un nombre entre 0 et 6) ");
                        numColonne = numeroColonne.nextInt();
                        Scanner numeroLigne = new Scanner(System.in);
                        System.out.println(" Dans quelle colonne souhaitez-vous récupérer votre Jeton ? (Saisissez un nombre entre 0 et 5) ");
                        numLigne = numeroLigne.nextInt();
                        if ((numLigne >= 0) && (numLigne < 6)) {
                            if ((numColonne >= 0) && (numColonne < 7)) {
                                Jeton recupJeton = grilleJeu.recupererJeton(numLigne, numColonne);
                                joueurCourant.ajouterJeton(recupJeton);
                                boolean jetonSup = grilleJeu.supprimerJeton(numLigne, numColonne);
                                if (jetonSup == true) {
                                    System.out.println("Fin récupération jeton");
                                }
                            }
                        }
                        grilleJeu.tasserGrille(numLigne, numColonne);
                        break;
                    case 3 :
                        System.out.println("Désintégration d'un jeton");
                        if (joueurCourant.nombreDesintegrateurs != 0) {
                            Scanner nbColonne = new Scanner(System.in);
                            System.out.println(" Dans quelle colonne souhaitez-vous désintégrer un Jeton ? (Saisissez un nombre entre 0 et 6) ");
                            numColonne = nbColonne.nextInt();
                            Scanner nbLigne = new Scanner(System.in);
                            System.out.println(" Dans quelle colonne souhaitez-vous désintégrer un Jeton ? (Saisissez un nombre entre 0 et 5) ");
                            numLigne = nbLigne.nextInt();
                            if ((numLigne >= 0) && (numLigne < 6)) {
                                if ((numColonne >= 0) && (numColonne < 7)) {
                                    boolean jetonDetruit = grilleJeu.supprimerJeton(numLigne, numColonne);
                                    if (jetonDetruit == true) {
                                        System.out.println("Fin destruction jeton");
                                    }
                                }
                            }
                            grilleJeu.tasserGrille(numLigne, numColonne);
                        }
                        else {
                            System.out.println("Veuillez changer d'action.");
                        }
                        break;
                }
                
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
