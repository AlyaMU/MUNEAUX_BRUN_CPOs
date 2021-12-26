/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
    ArrayList<String> coupsParties = new ArrayList<String>();
    ArrayList<String> chronoParties = new ArrayList<String>();

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
                    chronoParties.add(nomsJoueurs + " " + data);
                } else {
                    coupsParties.add(nomsJoueurs + " " + data);
                }
                compteur += 1;
            }
            Collections.sort(coupsParties);
            Collections.sort(chronoParties);
            System.out.println(coupsParties);
            System.out.println(chronoParties);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
