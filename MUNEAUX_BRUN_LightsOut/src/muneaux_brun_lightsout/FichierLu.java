/*
 * MUNEAUX BRUN Lights Out
 * Projet fin de Semestre 3 2ème année EPF
 */
package muneaux_brun_lightsout;

/**
 *
 * @author Alya
 */
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;
import java.util.Collections;

public class FichierLu extends FichierEcrit {

    String nomsJoueurs = "";
    public ArrayList<String> coupsParties = new ArrayList<String>();
    public ArrayList<String> chronoParties = new ArrayList<String>();

    void lireFichier() {
        int compteur = 1;
        try {
            File myObj = new File("FichierLightsOut.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (compteur%2 != 0) {
                    nomsJoueurs = data;
                }
                else if (compteur % 4 == 0) { // Le chiffre lu correspond a un nombre de secondes
                    chronoParties.add(data + "                  " + nomsJoueurs);
                } else {
                    coupsParties.add(data + "                  " + nomsJoueurs);
                }
                compteur += 1;
            }
            Collections.sort(coupsParties);
            Collections.sort(chronoParties);
            System.out.println("Meilleurs coups");
            System.out.println(coupsParties);
            System.out.println(chronoParties);
            System.out.println("Meilleurs temps");
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    ArrayList envoieCoupsPartie(){
        return(coupsParties);
    }
    ArrayList envoieChronoParties(){
        return(coupsParties);
    }

}
