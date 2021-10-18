/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_muneaux_gomez;

/**
 *
 * @author Alya
 */
public class TP2_relation_1_MUNEAUX_GOMEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Fichier principal
        
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ; 
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ; 
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ; 
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ; 
        Voiture uneToyota = new Voiture ("Corolla", "Toyota", 7);

        Personne Bob = new Personne("Bobby", "Sixkiller"); 
        Personne Reno = new Personne("Reno", "Raines"); 

        System.out.println("Liste des voitures disponibles \n"+ uneClio  +  "\n" + uneAutreClio   + "\n" + une2008   + "\n" + uneMicra + "\n" + uneToyota);
        System.out.println("Propriétaires : \n" + Bob + "\n" + Reno);
        
        Bob.liste_voitures[0] = uneClio; 
        uneClio.Proprietaire = Bob; 
        Bob.liste_voitures[1] = une2008;
        une2008.Proprietaire = Bob;
        Bob.nbVoitures = 2;
        System.out.println("La premiere voiture de Bob est " + Bob.liste_voitures[0]); 
        System.out.println("La deuxième voiture de Bob est " + Bob.liste_voitures[1]);
        
        Reno.liste_voitures[0] = uneAutreClio;
        uneAutreClio.Proprietaire = Reno;
        Reno.liste_voitures[0] = uneAutreClio;
        Reno.nbVoitures = 1;
        Reno.ajouter_voiture(uneToyota);
        System.out.println("La premiere voiture de Reno est " + Reno.liste_voitures[0]);
        System.out.println("La deuxième voiture de Reno est " + Reno.liste_voitures[1]);
        
        
    }
}
