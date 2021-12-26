/*
 * MUNEAUX BRUN Lights Out
 * Projet fin de Semestre 3 2ème année EPF
 */
package muneaux_brun_lightsout;

/**
 *
 * @author Alya
 */
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class FichierEcrit extends Fichier {
    void ecrireFichier(String unNom, String nbCoups, String nbSecondes) {
    try {
      FileWriter myWriter = new FileWriter("FichierLightsOut.txt",true);
      myWriter.write(unNom + "\n");
      myWriter.write(nbCoups + "\n");
      myWriter.write(unNom + "\n");
      myWriter.write(nbSecondes + "\n");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
