/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_muneaux_gomez;

import java.util.Scanner;

/**
 *
 * @author Alya
 */
public class TP2_convertisseurObjet_MUNEAUX_GOMEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Fichier principal
        float temperature;
        int conversion;
        double resultat = 0.0;
        String temp1 = "";
        String temp2 = "";
        int compteur = 0;
        Convertisseur Convertisseur = new Convertisseur();
        Scanner valConvEntier = new Scanner(System.in);
        System.out.println("Nombre de conversions à effectuer :");
        Convertisseur.nbConversions = valConvEntier.nextInt();
        int conv = Convertisseur.nbConversions;
        System.out.println("Conversions : " + conv);
        while (compteur != conv) {
            Scanner valDouble = new Scanner(System.in);
            System.out.println("Bonjour, saisissez une valeur :");
            temperature = (float) valDouble.nextDouble();
            System.out.println("Saisissez la conversion que vous souhaitez effectuer : ");
            System.out.println("1) De Celcius vers Kelvin \n 2) De Kelvin vers Celcius");
            System.out.println("3) De Farenheit vers Celcius \n 4) De Celcius vers Farenheit");
            System.out.println("5) De Kelvin vers Farenheit \n 6) De Farenheit vers Kelvin");
            Scanner valEntier = new Scanner(System.in);
            conversion = valEntier.nextInt();
            switch (conversion) {
                case 1 :
                    resultat = Convertisseur.CelciusVersKelvin(temperature);
                    temp1 = "Celsius";
                    temp2 = "Kelvin";
                    break;
                case 2 :
                    resultat = Convertisseur.KelvinVersCelcius(temperature);
                    temp2 = "Celsius";
                    temp1 = "Kelvin";
                    break;
                case 3 :
                    resultat = Convertisseur.FarenheitVersCelcius(temperature);
                    temp2 = "Celsius";
                    temp1 = "Farenheit";
                    break;
                case 4 :
                    resultat = Convertisseur.CelciusVersFarenheit(temperature);
                    temp1 = "Celsius";
                    temp2 = "Farenheit";
                    break;
                case 5 :
                    resultat = Convertisseur.KelvinVersFarenheit(temperature);
                    temp1 = "Kelvin";
                    temp2 = "Farenheit";
                    break;
                case 6 :
                    resultat = Convertisseur.FarenheitVersKelvin(temperature);
                    temp2 = "Kelvin";
                    temp1 = "Farenheit";
                    break;
            }
            System.out.println(temperature + " " +  temp1 + " est égal à " + resultat + " " + temp2);
            compteur += 1;
        }
        System.out.println(Convertisseur);
        
    }
    
}
