/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_muneaux_gomez;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Alya
 */
public class CelluleGraphique extends JButton {
    
    Cellule celluleAssociee;
    ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/images/celluleVide.png"));
    ImageIcon img_desint = new javax.swing.ImageIcon(getClass().getResource("/images/desintegrateur.png"));
    ImageIcon img_jetonJaune = new javax.swing.ImageIcon(getClass().getResource("/images/jetonJaune.png"));
    ImageIcon img_jetonRouge = new javax.swing.ImageIcon(getClass().getResource("/images/jetonRouge.png"));
    ImageIcon img_trouNoir = new javax.swing.ImageIcon(getClass().getResource("/images/trouNoir.png"));
    
    public CelluleGraphique(Cellule uneCellule) {
        celluleAssociee = uneCellule;
    }
    
    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        if (celluleAssociee.presenceTrouNoir() == true) {
            setIcon(img_trouNoir); // On attribue l'image trouNoir.png
        }
        else if (celluleAssociee.presenceDesintegrateur() == true) {
            setIcon(img_desint); // On attribue l'image desintegrateur.png
        }
        else {
            String couleur_jeton = celluleAssociee.lireCouleurDuJeton();
            switch (couleur_jeton) {
                case ("Rouge") :
                    setIcon(img_jetonRouge);
                    break;
                case ("Jaune") :
                    setIcon(img_jetonJaune);
                    break;
                case ("Vide") :
                    setIcon(img_vide); // On attribue l'image celluleVide.png
                    break;
            }
        }   
    }
    
    
}
