/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package muneaux_brun_lightsout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Alya
 */
public class MUNEAUX_BRUN_LightsOut extends javax.swing.JFrame {
    
    int nbSecondes = 0;
        
    public MUNEAUX_BRUN_LightsOut() {
        initComponents();
        Grille grilleTest = new Grille();
        panneau_chrono_nb_coup.setVisible(false);
        panneau_nom_bonus.setVisible(true);
        for (int li = 4; li >= 0; li--) {
            for (int col = 0; col < 5; col++) {
                CelluleGraphique cellGraph = new CelluleGraphique(grilleTest.CellulesJeu[li][col]);
                panneau_grille.add(cellGraph);
            }
        }

        String nomJoueur = nom_joueur.getText();
        Joueur leJoueur = new Joueur(nomJoueur);
        nb_bonus.setText("0");
        nb_coups.setText("0");
        
    }
    
    
    
    ActionListener tache_recurrente = new ActionListener() {
        public void actionPerformed(ActionEvent e1) {
            nbSecondes++;
            txt_chrono.setText(nbSecondes + "");
        }
        ;
        };
		/* instanciation du timer */
	Timer monChrono = new Timer(1000, tache_recurrente);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneau_grille = new javax.swing.JPanel();
        panneau_nom_bonus = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nb_bonus = new javax.swing.JLabel();
        nom_joueur = new javax.swing.JTextField();
        panneau_difficulteEtDemarrer = new javax.swing.JPanel();
        btn_Normal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_Demarrer = new javax.swing.JButton();
        btn_FeteCouleur = new javax.swing.JButton();
        btn_Montre = new javax.swing.JButton();
        panneau_chrono_nb_coup = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_chrono = new javax.swing.JLabel();
        nb_coups = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(255, 255, 255));
        panneau_grille.setLayout(new java.awt.GridLayout(5, 5));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 590, 570));

        panneau_nom_bonus.setBackground(new java.awt.Color(20, 121, 246));
        panneau_nom_bonus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel2.setText("Nom du Joueur :");
        panneau_nom_bonus.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel3.setText("Information du Joueur");
        panneau_nom_bonus.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel10.setText("Nombre de bonus (Difficile) :");
        panneau_nom_bonus.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        nb_bonus.setText("nb_bonus");
        panneau_nom_bonus.add(nb_bonus, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 60, 20));

        nom_joueur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_joueurActionPerformed(evt);
            }
        });
        panneau_nom_bonus.add(nom_joueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 70, -1));

        getContentPane().add(panneau_nom_bonus, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 360, 210));

        panneau_difficulteEtDemarrer.setBackground(new java.awt.Color(153, 255, 153));
        panneau_difficulteEtDemarrer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Normal.setText("Normal");
        btn_Normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NormalActionPerformed(evt);
            }
        });
        panneau_difficulteEtDemarrer.add(btn_Normal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 100, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("      Veuillez choisir votre mode de jeu :");
        panneau_difficulteEtDemarrer.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 280, -1));

        btn_Demarrer.setBackground(new java.awt.Color(204, 204, 204));
        btn_Demarrer.setText("Démarrer la partie");
        btn_Demarrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DemarrerActionPerformed(evt);
            }
        });
        panneau_difficulteEtDemarrer.add(btn_Demarrer, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 140, -1));

        btn_FeteCouleur.setText("Fête colorée");
        btn_FeteCouleur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FeteCouleurActionPerformed(evt);
            }
        });
        panneau_difficulteEtDemarrer.add(btn_FeteCouleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 100, -1));

        btn_Montre.setText("Contre-la-montre");
        btn_Montre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MontreActionPerformed(evt);
            }
        });
        panneau_difficulteEtDemarrer.add(btn_Montre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 120, -1));

        getContentPane().add(panneau_difficulteEtDemarrer, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 360, 130));

        panneau_chrono_nb_coup.setBackground(new java.awt.Color(221, 56, 31));
        panneau_chrono_nb_coup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel4.setText("Information de la Partie en cours");
        panneau_chrono_nb_coup.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 300, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel5.setText("Nombre de Coups :");
        panneau_chrono_nb_coup.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel6.setText("Chronomètre :");
        panneau_chrono_nb_coup.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        txt_chrono.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txt_chrono.setText("jLabel7");
        panneau_chrono_nb_coup.add(txt_chrono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 80, 40));

        nb_coups.setText("nb_coups");
        panneau_chrono_nb_coup.add(nb_coups, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        getContentPane().add(panneau_chrono_nb_coup, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 360, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_NormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NormalActionPerformed
        btn_Normal.setEnabled(false);
        btn_Montre.setEnabled(false);
        btn_FeteCouleur.setEnabled(false);
        Consigne_Normal Normal = new Consigne_Normal();
        Normal.setVisible(true);
    }//GEN-LAST:event_btn_NormalActionPerformed

    private void btn_DemarrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DemarrerActionPerformed
        btn_Demarrer.setEnabled(false);
        panneau_chrono_nb_coup.setVisible(true);
        panneau_nom_bonus.setVisible(true);
        panneau_grille.repaint();
        nbSecondes = 0;
        txt_chrono.setText(nbSecondes + "");
        monChrono.start();
    }//GEN-LAST:event_btn_DemarrerActionPerformed

    private void btn_FeteCouleurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FeteCouleurActionPerformed
        Consigne_FeteCouleur feteCouleur = new Consigne_FeteCouleur();
        btn_Normal.setEnabled(false);
        btn_Montre.setEnabled(false);
        btn_FeteCouleur.setEnabled(false);
        feteCouleur.setVisible(true);
    }//GEN-LAST:event_btn_FeteCouleurActionPerformed

    private void btn_MontreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MontreActionPerformed
        Consigne_Montre Montre = new Consigne_Montre();
        btn_Normal.setEnabled(false);
        btn_Montre.setEnabled(false);
        btn_FeteCouleur.setEnabled(false);
        Montre.setVisible(true);
    }//GEN-LAST:event_btn_MontreActionPerformed

    private void nom_joueurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_joueurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_joueurActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MUNEAUX_BRUN_LightsOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MUNEAUX_BRUN_LightsOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MUNEAUX_BRUN_LightsOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MUNEAUX_BRUN_LightsOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MUNEAUX_BRUN_LightsOut().setVisible(true);
            }
        });
        
        // Test des fonctionnalités du code
    
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Demarrer;
    private javax.swing.JButton btn_FeteCouleur;
    private javax.swing.JButton btn_Montre;
    private javax.swing.JButton btn_Normal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel nb_bonus;
    private javax.swing.JLabel nb_coups;
    private javax.swing.JTextField nom_joueur;
    private javax.swing.JPanel panneau_chrono_nb_coup;
    private javax.swing.JPanel panneau_difficulteEtDemarrer;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_nom_bonus;
    private javax.swing.JLabel txt_chrono;
    // End of variables declaration//GEN-END:variables
}
