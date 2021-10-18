/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_muneaux_gomez;

/**
 *
 * @author Alya
 */
public class TP2_Bieres_MUNEAUX_GOMEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Fichier principal
        // Création d'un premier objet de la classe BouteilleBiere
        System.out.println("Première Bière : ");
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des Trolls",(float)7.0,"Dubuisson");
        // uneBiere.nom = "Cuvée des trolls"; 
        // uneBiere.degreAlcool = (float) 7.0; 
        // uneBiere.brasserie = "Dubuisson";
        uneBiere.ouverte = false;
        // On effectue la méthode de la classe servant à afficher l'étiquette
        uneBiere.lireEtiquette();
        uneBiere.decapsuler();
        System.out.println(uneBiere);
        
        // Création d'un deuxième objet de la classe BouteilleBiere, on crée son étiquette comme pour la première
        System.out.println("Deuxième Bière : ");
        BouteilleBiere uneDeuxiemeBiere = new BouteilleBiere("Leffe", (float) 6.6, "Abbaye de Leffe");
        // uneDeuxiemeBiere.nom = "Leffe"; 
        // uneDeuxiemeBiere.degreAlcool = (float) 6.6; 
        // uneDeuxiemeBiere.brasserie = "Abaye de Leffe";
        uneDeuxiemeBiere.ouverte = false;
        uneDeuxiemeBiere.lireEtiquette();
        System.out.println(uneDeuxiemeBiere);
        
        System.out.println("Troisième Bière : ");
        BouteilleBiere uneTroisiemeBiere = new BouteilleBiere("Despe", (float) 4.5, "Monoprix");
        uneTroisiemeBiere.ouverte = false;
        uneTroisiemeBiere.lireEtiquette();
        System.out.println(uneTroisiemeBiere);
        
        System.out.println("Quatrième Bière : ");
        BouteilleBiere uneQuatriemeBiere = new BouteilleBiere("Souffrance de 2A", (float) 8.9, "EPF Montpellier");
        uneQuatriemeBiere.ouverte = false;
        uneQuatriemeBiere.lireEtiquette();
        uneQuatriemeBiere.decapsuler();
        System.out.println(uneQuatriemeBiere);
        
        System.out.println("Cinquième Bière : ");
        BouteilleBiere uneCinquiemeBiere = new BouteilleBiere("Pinte", (float) 5.3, "Babar");
        uneCinquiemeBiere.ouverte = false;
        uneCinquiemeBiere.lireEtiquette();
        System.out.println(uneCinquiemeBiere);
        
    }
    
}
