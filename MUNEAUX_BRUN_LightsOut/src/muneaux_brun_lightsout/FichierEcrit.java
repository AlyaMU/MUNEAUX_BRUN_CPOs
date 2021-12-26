/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muneaux_brun_lightsout;

/**
 *
 * @author Alya
 */
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class FichierEcrit extends Fichier {
    void ecrireFichier(String nbCoups, String nbSecondes) {
    try {
      FileWriter myWriter = new FileWriter("FichierLightsOut.txt");
      myWriter.write(nbCoups + "\n");
      myWriter.write(nbSecondes + "\n");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
