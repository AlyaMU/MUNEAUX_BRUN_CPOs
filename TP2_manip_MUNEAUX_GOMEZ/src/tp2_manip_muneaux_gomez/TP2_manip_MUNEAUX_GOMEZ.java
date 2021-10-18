/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_muneaux_gomez;

/**
 *
 * @author Alya
 */
public class TP2_manip_MUNEAUX_GOMEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Fichier principal
        
        Tartiflette assiette1 = new Tartiflette(500); 
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ; 
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ; 
        assiette2.nbCalories = 800;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ; 
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ; 
        // Les références objet assiette2 et assiette3 semblent référencer le même objet
        
        // On intervertit les références objets des variables assiette1 et assiette2
        assiette3 = assiette1;
        assiette1 = assiette2;
        assiette2 = assiette3;
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ; 
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        
        // Moussaka assiette666 = assiette1 ; 
        // Erreur : types incompatibles
        // Moussaka assiette667 = new Tartiflette() ; 
        // Erreur : le constructeur de la classe Tartiflette ne peut pas être appliqué
        // Une référence objet ne peut référencer qu'un type d'objet donné
        
        Moussaka []tabMoussaka = new Moussaka[10];
        for (int i = 0; i<10; i++) {
            tabMoussaka[i] = new Moussaka(0);
        }
        
    }
    
}
