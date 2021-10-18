/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_muneaux_gomez;

import java.util.Scanner;

/**
 *
 * @author Alya
 */
public class Convertisseur {
    // Attributs :
    int nbConversions;
    
    // Méthodes :
    
    void Convertisseur() {
        nbConversions = 0;
    }
    
    float CelciusVersKelvin(float temperature) {
        float tKelvin;
        tKelvin = (float) (temperature + 273.15);
        return tKelvin;
    }
    
    float KelvinVersCelcius(float temperature) {
        float tCelcius;
        tCelcius = (float) (temperature - 273.15);
        return tCelcius;
    }
    
    float FarenheitVersCelcius(float temperature) {
        float tCelcius;
        tCelcius = (float) (temperature - 16.2);
        return tCelcius;
    }
    
    float CelciusVersFarenheit(float temperature) {
        float tFarenheit;
        tFarenheit = (float) (temperature + 32.8);
        return tFarenheit;
    }
    
    float FarenheitVersKelvin(float temperature) {
        float tKelvin;
        tKelvin = (float) (temperature + 254.92);
        return tKelvin;
    }
    
    float KelvinVersFarenheit(float temperature) {
        float tFarenheit;
        tFarenheit = (float) (temperature -456.87);
        return tFarenheit;
    }
    
    @Override 
    public String toString () { 
      return "Nombre de conversions : "+ nbConversions; 
    } 
}
