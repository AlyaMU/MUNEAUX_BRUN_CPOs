/*
 * Alya MUNEAUX, Nathanael GOMEZ TDC
 * TP1 : syntaxe de base
 * Exo2 : convertisseur de températures
 */
package tp1_convertisseur_muneaux;

import java.util.Scanner;

/**
 *
 * @author Alya
 */
public class TP1_convertisseur_MUNEAUX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double temperature;
        int conversion;
        double resultat = 0.0;
        String temp1 = "";
        String temp2 = "";
        Scanner valDouble = new Scanner(System.in);
        System.out.println("Bonjour, saisissez une valeur :");
        temperature = valDouble.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaitez effectuer : ");
        System.out.println("1) De Celcius vers Kelvin \n 2) De Kelvin vers Celcius");
        System.out.println("3) De Farenheit vers Celcius \n 4) De Celcius vers Farenheit");
        System.out.println("5) De Kelvin vers Farenheit \n 6) De Farenheit vers Kelvin");
        Scanner valEntier = new Scanner(System.in);
        conversion = valEntier.nextInt();
        switch (conversion) {
            case 1 :
                resultat = CelsiusVersKelvin(temperature);
                temp1 = "Celsius";
                temp2 = "Kelvin";
                break;
            case 2 :
                resultat = KelvinVersCelsius(temperature);
                temp2 = "Celsius";
                temp1 = "Kelvin";
                break;
            case 3 :
                resultat = FarenheitVersCelsius(temperature);
                temp2 = "Celsius";
                temp1 = "Farenheit";
                break;
            case 4 :
                resultat = CelsiusVersFahrenheit(temperature);
                temp1 = "Celsius";
                temp2 = "Farenheit";
                break;
            case 5 :
                resultat = KelvinVersFahrenheit(temperature);
                temp1 = "Kelvin";
                temp2 = "Farenheit";
                break;
            case 6 :
                resultat = FarenheitVersKelvin(temperature);
                temp2 = "Kelvin";
                temp1 = "Farenheit";
                break;
        }
        System.out.println(temperature + " " +  temp1 + " est égal à " + resultat + " " + temp2);
    }
    public static double CelsiusVersKelvin (double temperature) { 
        double tKelvin;
        tKelvin = temperature + 273.15;
        return tKelvin;
    }
   public static double KelvinVersCelsius (double temperature) { 
        double tCelcius;
        tCelcius = temperature - 273.15;
        return tCelcius;
    } 
    public static double FarenheitVersCelsius (double temperature) { 
        double tCelcius;
        tCelcius = temperature - 16.2;
        return tCelcius;
    }
    public static double CelsiusVersFahrenheit (double temperature) { 
        double tFarenheit;
        tFarenheit = temperature + 32.8;
        return tFarenheit;
    }
    public static double KelvinVersFahrenheit (double temperature) {
        double tFarenheit;
        tFarenheit = temperature -456.87;
        return tFarenheit;
    }
    public static double FarenheitVersKelvin (double temperature) { 
        double tKelvin;
        tKelvin = temperature + 254.92;
        return tKelvin;
    }
    
}
