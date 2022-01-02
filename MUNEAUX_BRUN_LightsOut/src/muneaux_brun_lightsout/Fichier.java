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
    
    // Ajout source de création du fichier :
    // https://www.w3schools.com/java/java_files_create.asp
    
    void creerFichier () {
    try {
      File myObj = new File("FichierLightsOut.txt");
      if (myObj.createNewFile()) {
        System.out.println("\n File created: " + myObj.getName());
      } else {
        System.out.println("\n File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}

