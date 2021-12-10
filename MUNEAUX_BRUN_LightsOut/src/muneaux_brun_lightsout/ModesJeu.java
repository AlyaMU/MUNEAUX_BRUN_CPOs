/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muneaux_brun_lightsout;

/**
 *
 * @author Alya
 */
public class ModesJeu {
    
    // Programmation des modes de partie
    
    // Attributs
    
    Grille grilleJeu = new Grille();
    
    // Méthodes
    
    void modeNormal() {
        int colHasard;
        int ligneHasard;
        int compteurCase = 0;
        while (compteurCase != 5) {
            colHasard = (int)(Math.random()*4); // On définit un nombre au hasard entre 0 et 4
            ligneHasard = (int)(Math.random()*4); 
            grilleJeu.changerCase(ligneHasard, colHasard);
            compteurCase += 1;
        }
        System.out.println("La partie peut commmencer");
        grilleJeu.afficherGrilleSurConsole();
    }
}
