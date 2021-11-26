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
       int compteurDes = 0;
       while (compteurDes != 3) {
           colHasard = (int)(Math.random()*6); // On définit un nombre au hasard entre 0 et 6
           ligneHasard = (int)(Math.random()*5); 
           if (grilleJeu.CellulesJeu[ligneHasard][colHasard].presenceDesintegrateur() == false) {
               grilleJeu.placerDesintegrateur(ligneHasard, colHasard);
               compteurDes += 1;
           }
       }
       
       int compteurTrou = 0;
       while (compteurTrou != 5) {
           colHasard = (int)(Math.random()*6); // On définit un nombre au hasard entre 0 et 6
           ligneHasard = (int)(Math.random()*5); 
           if ((grilleJeu.CellulesJeu[ligneHasard][colHasard].presenceTrouNoir() == false) && (grilleJeu.CellulesJeu[ligneHasard][colHasard].presenceDesintegrateur() == false)) {
                grilleJeu.placerTrouNoir(ligneHasard, colHasard);
                compteurTrou += 1;
                if (compteurTrou == 1) {
                    grilleJeu.placerDesintegrateur(ligneHasard, colHasard);
                }
                if (compteurTrou == 4) {
                    grilleJeu.placerDesintegrateur(ligneHasard, colHasard);
                }
           }
       }
       
    }
    
    void debuterPartie(){ 
        int numColonne = 4;
        int numLigne = 0;
        boolean resColonne = false;
        boolean partie = false;
        boolean jetonRecupere = false;
        boolean jetonDesintegre = false;
        int nbJetons;
        int ligneJetonPlace = 0;
        grilleJeu.afficherGrilleSurConsole();
        while (partie!= true){ // La partie dure tant que personne n'a gagné ou que la grille n'est pas pleine
            while (joueurCourant == ListeJoueurs[0]){ // Tour du joueur 1
                System.out.println("\n C'est au tour de " + joueurCourant.Nom);
                Scanner choixAction = new Scanner(System.in);
                System.out.println("Souhaitez vous : \n 1/Placer un jeton ? \n 2/Récupérer un jeton ? \n 3/Utiliser un désintégrateur ?");
                int action = choixAction.nextInt();
                if ((action > 0) && (action < 4)) {
                    switch (action) {
                        case 1 :
                            if (joueurCourant.nombreJetonsRestants != 0) {
                                System.out.println("Ajout d'un jeton");
                                while (resColonne!=true){ // On réessaye d'ajouter le jeton tant que son placement sur la grille n'est pas valide
                                    Scanner numeroColonne = new Scanner(System.in);
                                    System.out.println(" Dans quelle colonne souhaitez-vous mettre votre Jeton ? (Saisissez un nombre entre 0 et 6) ");
                                    numColonne = numeroColonne.nextInt(); // Le joueur choisit la colonne dans laquelle il place le jeton, on vérifie bien que la colonne existe
                                    if ((numColonne >= 0) && (numColonne < 7)) {
                                        nbJetons = ListeJoueurs[0].nombreJetonsRestants;
                                        resColonne = grilleJeu.ajouterJetonDansColonne(joueurCourant, numColonne); 
                                        // On vérifie que la colonne n'est pas pleine et on ajoute, rescol récupère si l'ajout s'est bien passé
                                    }       
                                }
                                System.out.println("Fin choix colonne");
                                ligneJetonPlace = ligneJetonJoue(numColonne);
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
                            }
                            else {
                                System.out.println("Vous n'avez plus de jetons, veuillez changer d'action.");
                                continue;
                            }
                            break;
                        case 2 :
                            System.out.println("Récupération d'un jeton");
                            boolean jetonPresent = false;
                            for(int i = 0; i < 6; i++) {
                                for (int j = 0; j < 7; j ++) {
                                    boolean remplie = grilleJeu.celluleOccupee(i, j);
                                    if (remplie == true) {
                                        String colJ = grilleJeu.lireCouleurDuJeton(i, j);
                                        if (colJ == joueurCourant.Couleur) {
                                            jetonPresent = true;
                                        }
                                    }
                                }
                            }
                            if (jetonPresent == true) {
                                while (jetonRecupere == false) {
                                    Scanner numeroColonne = new Scanner(System.in);
                                    System.out.println(" Dans quelle colonne souhaitez-vous récupérer votre Jeton ? (Saisissez un nombre entre 0 et 6) ");
                                    numColonne = numeroColonne.nextInt();
                                    Scanner numeroLigne = new Scanner(System.in);
                                    System.out.println(" Dans quelle colonne souhaitez-vous récupérer votre Jeton ? (Saisissez un nombre entre 0 et 5) ");
                                    numLigne = numeroLigne.nextInt();
                                    jetonRecupere = recupJeton(numLigne, numColonne);
                                }
                            }
                            else {
                                System.out.println("Vous ne possédez pas de jeton sur la grille");
                                continue;
                            }
                            grilleJeu.tasserGrille();
                            break;
                        case 3 :
                            System.out.println("Désintégration d'un jeton");
                            if (joueurCourant.nombreDesintegrateurs != 0) {
                                while (jetonDesintegre == false) {
                                    Scanner nbColonne = new Scanner(System.in);
                                    System.out.println(" Dans quelle colonne souhaitez-vous désintégrer un Jeton ? (Saisissez un nombre entre 0 et 6) ");
                                    numColonne = nbColonne.nextInt();
                                    Scanner nbLigne = new Scanner(System.in);
                                    System.out.println(" Dans quelle ligne souhaitez-vous désintégrer un Jeton ? (Saisissez un nombre entre 0 et 5) ");
                                    numLigne = nbLigne.nextInt();
                                    jetonDesintegre = desintegrerJeton(numLigne, numColonne);
                                }
                                grilleJeu.tasserGrille();
                            }
                            else {
                                System.out.println("Veuillez changer d'action.");
                                continue;
                            }
                            break;
                    }
                }
                else {
                    System.out.println("Votre action n'est pas disponible. Veuillez réessayer.");
                    continue;
                }
                System.out.println("Nombre de jetons du Joueur 1 : " + joueurCourant.nombreJetonsRestants);
                grilleJeu.afficherGrilleSurConsole();
                if (grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0]) == true){
                    System.out.println("VICTOIRE DU JOUEUR 1 !");
                    partie = true;
                }
                else if (joueurCourant.nombreJetonsRestants == 0 && joueurCourant.nombreDesintegrateurs == 0) {
                    System.out.println("Fin de partie, le joueur 2 n'a plus de jetons ou désintégrateurs.");
                    partie = true;
                }
                else if (grilleJeu.etreRemplie() == true){
                    System.out.println("Fin de partie, la grille est pleine.");
                    partie = true;
                }
                else {
                    resColonne = false;
                    joueurCourant = ListeJoueurs[1]; // On repasse la main au joueur 2
                } 
            }
            
            while (joueurCourant == ListeJoueurs[1]){ // Tour du joueur 2
                System.out.println("\n C'est au tour de " + joueurCourant.Nom);
                Scanner choixAction = new Scanner(System.in);
                System.out.println("Souhaitez vous : \n 1/Placer un jeton ? \n 2/Récupérer un jeton ? \n 3/ Utiliser un désintégrateur ?");
                int action = choixAction.nextInt();
                System.out.println(action);
                if ((action > 0) && (action < 4)) {
                    switch (action) {
                        case 1 :
                            if (joueurCourant.nombreJetonsRestants != 0) {
                                while (resColonne!=true){
                                    System.out.println("Choix de la colonne");
                                    Scanner numeroColonne = new Scanner(System.in);
                                    System.out.println("Dans quelle colonne souhaitez-vous mettre votre Jeton ? (Saisissez un nombre entre 0 et 6) ");
                                    numColonne = numeroColonne.nextInt(); 
                                    if ((numColonne >= 0) && (numColonne < 7)) {
                                        nbJetons = ListeJoueurs[1].nombreJetonsRestants;
                                        resColonne = grilleJeu.ajouterJetonDansColonne(joueurCourant, numColonne);
                                    }
                                }
                                System.out.println("Fin choix colonne"); 
                                ligneJetonPlace = ligneJetonJoue(numColonne);
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
                            }
                            else {
                                System.out.println("Vous n'avez plus de jetons, veuillez changer d'action.");
                                continue;
                            }
                            break;
                        case 2 :
                            System.out.println("Récupération d'un jeton");
                            boolean jetonPresent = false;
                            for(int i = 0; i < 6; i++) {
                                for (int j = 0; j < 7; j ++) {
                                    boolean remplie = grilleJeu.celluleOccupee(i, j);
                                    if (remplie == true) {
                                        String colJ = grilleJeu.lireCouleurDuJeton(i, j);
                                        if (colJ == joueurCourant.Couleur) {
                                            jetonPresent = true;
                                        }
                                    }
                                }
                            }
                            if (jetonPresent == true) {
                                while (jetonRecupere == false) {
                                    Scanner numeroColonne = new Scanner(System.in);
                                    System.out.println(" Dans quelle colonne souhaitez-vous récupérer votre Jeton ? (Saisissez un nombre entre 0 et 6) ");
                                    numColonne = numeroColonne.nextInt();
                                    Scanner numeroLigne = new Scanner(System.in);
                                    System.out.println(" Dans quelle colonne souhaitez-vous récupérer votre Jeton ? (Saisissez un nombre entre 0 et 5) ");
                                    numLigne = numeroLigne.nextInt();
                                    jetonRecupere = recupJeton(numLigne, numColonne);
                                }
                            }
                            else {
                                System.out.println("Vous ne possédez pas de jeton sur la grille");
                                continue;
                            }
                            grilleJeu.tasserGrille();
                            break;
                        case 3 :
                            System.out.println("Désintégration d'un jeton");
                            if (joueurCourant.nombreDesintegrateurs != 0) {
                                while (jetonDesintegre == false) {
                                    Scanner nbColonne = new Scanner(System.in);
                                    System.out.println(" Dans quelle colonne souhaitez-vous désintégrer un Jeton ? (Saisissez un nombre entre 0 et 6) ");
                                    numColonne = nbColonne.nextInt();
                                    Scanner nbLigne = new Scanner(System.in);
                                    System.out.println(" Dans quelle ligne souhaitez-vous désintégrer un Jeton ? (Saisissez un nombre entre 0 et 5) ");
                                    numLigne = nbLigne.nextInt();
                                    jetonDesintegre = desintegrerJeton(numLigne, numColonne);
                                }
                                grilleJeu.tasserGrille();
                            }
                            else {
                                System.out.println("Vous ne possédez pas de désintégrateurs. Veuillez changer d'action.");
                                continue;
                            }
                            break;
                    }
                }    
                System.out.println("Nombre de jetons du Joueur 2 : " + joueurCourant.nombreJetonsRestants);
                grilleJeu.afficherGrilleSurConsole();
                if (grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1]) == true){
                    System.out.println("VICTOIRE DU JOUEUR 2 !");
                    partie = true;
                }
                else if (joueurCourant.nombreJetonsRestants == 0 && joueurCourant.nombreDesintegrateurs == 0) {
                    System.out.println("Fin de partie, le joueur 2 n'a plus de jetons ou désintégrateurs.");
                    partie = true;
                }
                else if (grilleJeu.etreRemplie() == true){
                    System.out.println("Fin de partie, la grille est pleine.");
                    partie = true;
                }
                else {
                    resColonne = false;
                    joueurCourant = ListeJoueurs[0]; // On repasse la main au joueur 1
                }  
            }
        }
        grilleJeu.viderGrille(); // On vide la grille à la fin de la partie
    
    }
    
    int ligneJetonJoue(int uneColonne) {
        int numColonne = uneColonne;
        int ligneJetonPlace = 0;
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
        return ligneJetonPlace;   
    }
    
    boolean recupJeton(int uneLigne, int uneColonne) {
        int nLigne = uneLigne;
        int nColonne = uneColonne;
        if ((nLigne >= 0) && (nLigne < 6)) {
            if ((nColonne >= 0) && (nColonne < 7)) {
                if (grilleJeu.CellulesJeu[nLigne][nColonne].jetonCourant == null) {
                    System.out.println("Il n'y a pas de jeton sur cette case");
                    return false;
                }
                else if (grilleJeu.CellulesJeu[nLigne][nColonne].jetonCourant.couleur == joueurCourant.Couleur) {
                    Jeton recupJeton = grilleJeu.recupererJeton(nLigne, nColonne);
                    joueurCourant.ajouterJeton(recupJeton);
                    boolean jetonSup = grilleJeu.supprimerJeton(nLigne, nColonne);
                    if (jetonSup == true) {
                        System.out.println("Fin récupération jeton");
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                else {
                    System.out.println("Le jeton choisi n'est pas de votre couleur.");
                    return false;
                }  
            }
        }
        return false;
    }
    
    boolean desintegrerJeton(int uneLigne, int uneColonne) {
        int nLigne = uneLigne;
        int nColonne = uneColonne;
        if ((nLigne >= 0) && (nLigne < 6)) {
            if ((nColonne >= 0) && (nColonne < 7)) {
                if (grilleJeu.CellulesJeu[nLigne][nColonne].jetonCourant == null) {
                    System.out.println("Il n'y a pas de jeton sur cette case");
                    return false;
                }
                else if (grilleJeu.CellulesJeu[nLigne][nColonne].jetonCourant.couleur != joueurCourant.Couleur) {
                    boolean jetonDetruit = grilleJeu.supprimerJeton(nLigne, nColonne);
                    if (jetonDetruit == true) {
                        System.out.println("Fin destruction jeton");
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                else {
                    System.out.println("Le jeton choisi est de votre couleur.");
                    return false;
                }
                
            }
        }
        return false;
    }
}
