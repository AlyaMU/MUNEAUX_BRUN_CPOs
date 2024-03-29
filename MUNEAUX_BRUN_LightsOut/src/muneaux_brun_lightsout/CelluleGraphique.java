/*
 * MUNEAUX BRUN Lights Out
 * Projet fin de Semestre 3 2ème année EPF
 */
package muneaux_brun_lightsout;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Alya
 */
public class CelluleGraphique extends JButton {

    Cellule celluleAssociee;
    ImageIcon img_eteinte = new javax.swing.ImageIcon(getClass().getResource("/images/Case_eteinte.jpg"));
    ImageIcon img_allume1 = new javax.swing.ImageIcon(getClass().getResource("/images/Case_allume1.png"));
    ImageIcon img_allume2 = new javax.swing.ImageIcon(getClass().getResource("/images/Case_allume2.jpg"));
    
    public CelluleGraphique(Cellule uneCellule) {
        celluleAssociee = uneCellule;
    }

    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        if (celluleAssociee.etatCellule() == false) {
            setIcon(img_eteinte);
        }
        else if (celluleAssociee.couleur == "Rouge" || celluleAssociee.couleur==null){ 
            setIcon(img_allume1);
        }
        else if (celluleAssociee.couleur == "Jaune") {
                setIcon(img_allume2);
        }
    }
}

