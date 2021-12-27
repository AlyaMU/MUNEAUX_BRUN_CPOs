/*
 * MUNEAUX BRUN Lights Out
 * Projet fin de Semestre 3 2ème année EPF
 */
package muneaux_brun_lightsout;

/**
 *
 * @author Alya
 */
import java.io.File; // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class Fichier {
    
    void creerFichier () {
    try {
      File myObj = new File("FichierLightsOut.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
