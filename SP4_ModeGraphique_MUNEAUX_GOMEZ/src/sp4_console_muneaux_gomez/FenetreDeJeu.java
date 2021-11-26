/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sp4_console_muneaux_gomez;

import java.util.Scanner;

/**
 *
 * @author Alya
 */
public class FenetreDeJeu extends javax.swing.JFrame {

    // Attributs :
    Joueur[] ListeJoueurs = new Joueur[2];
    Joueur joueurCourant;
    Grille grilleJeu = new Grille();

    CelluleGraphique[][] tabBoutons = new CelluleGraphique[6][7];

    /**
     * Creates new form FenetreDeJeu
     */
    public FenetreDeJeu() {
        initComponents();
        panneau_info_joueurs.setVisible(false);
        panneau_info_partie.setVisible(false);

        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < 7; j++) {
                CelluleGraphique cellGraph = new CelluleGraphique(grilleJeu.CellulesJeu[i][j]);
                tabBoutons[i][j] = cellGraph;
                cellGraph.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        Cellule c = cellGraph.celluleAssociee;
                        if (c.jetonCourant == null) {
                            return;
                        }
                        if (c.jetonCourant.couleur.equals(joueurCourant.Couleur)) {
                            textemessage.setText("Le joueur " + joueurCourant.Nom + " récupère un de ses jetons");
                            Jeton jrecup = c.recupererJeton();
                            joueurCourant.ajouterJeton(jrecup);
                            c.supprimerJeton();
                            joueurSuivant();
                        } else {
                            if (joueurCourant.nombreDesintegrateurs > 0) {
                                textemessage.setText("Le joueur " + joueurCourant.Nom + " désintégre un jeton");
                                c.supprimerJeton();
                                joueurCourant.utiliserDesintegrateur();
                                joueurSuivant();
                            } else {
                                return;
                            }
                        }
                        grilleJeu.tasserGrille();
                        for (int i = 0; i < 6; i++) {
                            boolean colRemplie = grilleJeu.colonneRemplie(i);
                            if (colRemplie == false) {
                                int bouton = i;
                                switch (bouton) {
                                    case 0:
                                        btn_col_0.setEnabled(true);
                                        break;
                                    case 1:
                                        btn_col_1.setEnabled(true);
                                        break;
                                    case 2:
                                        btn_col_2.setEnabled(true);
                                        break;
                                    case 3:
                                        btn_col_3.setEnabled(true);
                                        break;
                                    case 4:
                                        btn_col_4.setEnabled(true);
                                        break;
                                    case 5:
                                        btn_col_5.setEnabled(true);
                                        break;
                                    case 6:
                                        btn_col_6.setEnabled(true);
                                        break;
                                }

                            }
                        }
                        panneau_grille.repaint();
                        lbl_J1_desint.setText(ListeJoueurs[0].nombreDesintegrateurs + "");
                        lbl_J2_desint.setText(ListeJoueurs[1].nombreDesintegrateurs + "");

                        boolean vict_J1 = grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0]);
                        boolean vict_J2 = grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1]);
                        if (vict_J1 && !vict_J2) {
                            textemessage.setText("Victoire de " + ListeJoueurs[0].Nom);
                            for (int i = 0; i < 6; i++) {
                                for (int j = 0; j < 7; j++) {
                                    tabBoutons[i][j].setEnabled(false);
                                }
                            }
                            System.out.println("ici");
                        }
                        if (vict_J2 && !vict_J1) {
                            textemessage.setText("Victoire de " + ListeJoueurs[1].Nom);
                            for (int i = 0; i < 6; i++) {
                                for (int j = 0; j < 7; j++) {
                                    tabBoutons[i][j].setEnabled(false);
                                }
                            }
                             System.out.println("la");
                        }
                        if (vict_J1 && vict_J2) {
                                                         System.out.println("la");

                            if (joueurCourant == ListeJoueurs[0]) {
                                textemessage.setText("Victoire de " + ListeJoueurs[1].Nom + " (faute de jeu)");
                                for (int i = 0; i < 6; i++) {
                                    for (int j = 0; j < 7; j++) {
                                        tabBoutons[i][j].setEnabled(false);
                                    }
                                }
                            } else {
                                textemessage.setText("Victoire de " + ListeJoueurs[0].Nom + " (faute de jeu)");
                                for (int i = 0; i < 6; i++) {
                                    for (int j = 0; j < 7; j++) {
                                        tabBoutons[i][j].setEnabled(false);
                                    }
                                }
                            }
                        }
                        panneau_grille.repaint();
                    }
                });
                panneau_grille.add(cellGraph);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneau_grille = new javax.swing.JPanel();
        panneau_creation_partie = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nom_joueur1 = new javax.swing.JTextField();
        nom_joueur2 = new javax.swing.JTextField();
        btn_start = new javax.swing.JButton();
        panneau_info_partie = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_JCourant = new javax.swing.JLabel();
        message = new javax.swing.JScrollPane();
        textemessage = new javax.swing.JTextArea();
        btn_col_0 = new javax.swing.JButton();
        btn_col_1 = new javax.swing.JButton();
        btn_col_2 = new javax.swing.JButton();
        btn_col_3 = new javax.swing.JButton();
        btn_col_4 = new javax.swing.JButton();
        btn_col_5 = new javax.swing.JButton();
        btn_col_6 = new javax.swing.JButton();
        panneau_info_joueurs = new javax.swing.JPanel();
        lbl_J1_desint = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_J1_nom = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_J1_couleur = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_J2_couleur = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_J2_desint = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_J2_nom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(255, 255, 255));
        panneau_grille.setLayout(new java.awt.GridLayout(6, 7));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 672, 576));

        panneau_creation_partie.setBackground(new java.awt.Color(0, 204, 204));
        panneau_creation_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom Joueur 2 :");
        panneau_creation_partie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 90, 40));

        jLabel2.setText("Nom Joueur 1 :");
        panneau_creation_partie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 40));
        panneau_creation_partie.add(nom_joueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 100, 30));

        nom_joueur2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_joueur2ActionPerformed(evt);
            }
        });
        panneau_creation_partie.add(nom_joueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 100, 30));

        btn_start.setText("Démarrer partie !");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        panneau_creation_partie.add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 130, -1));

        getContentPane().add(panneau_creation_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 290, 140));

        panneau_info_partie.setBackground(new java.awt.Color(0, 204, 204));
        panneau_info_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Infos jeu");
        panneau_info_partie.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 40));

        jLabel11.setText("Joueur Courant :");
        panneau_info_partie.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 90, 30));

        lbl_JCourant.setText("nomJoueur");
        panneau_info_partie.add(lbl_JCourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, 30));

        textemessage.setColumns(20);
        textemessage.setRows(5);
        message.setViewportView(textemessage);

        panneau_info_partie.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 190, -1));

        getContentPane().add(panneau_info_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, 290, 210));

        btn_col_0.setText("1");
        btn_col_0.setAlignmentX(50.0F);
        btn_col_0.setAlignmentY(20.0F);
        btn_col_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        btn_col_1.setText("2");
        btn_col_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 20, -1, -1));

        btn_col_2.setText("3");
        btn_col_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 20, -1, -1));

        btn_col_3.setText("4");
        btn_col_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 20, -1, -1));

        btn_col_4.setText("5");
        btn_col_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 20, -1, -1));

        btn_col_5.setText("6");
        btn_col_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        btn_col_6.setText("7");
        btn_col_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 20, -1, -1));

        panneau_info_joueurs.setBackground(new java.awt.Color(0, 204, 204));
        panneau_info_joueurs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_J1_desint.setText("nbDesintJoueur1");
        panneau_info_joueurs.add(lbl_J1_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 90, 20));

        jLabel5.setText("Joueur 1 :");
        panneau_info_joueurs.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 70, 30));

        jLabel6.setText("- couleur :");
        panneau_info_joueurs.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 70, 20));

        lbl_J1_nom.setText("nomJoueur1");
        panneau_info_joueurs.add(lbl_J1_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 60, 20));

        jLabel8.setText("- désintegrateurs :");
        panneau_info_joueurs.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, 20));

        lbl_J1_couleur.setText("couleurJoueur1");
        panneau_info_joueurs.add(lbl_J1_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 90, 20));

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        panneau_info_joueurs.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 290, 10));

        jLabel7.setText("Joueur 2 :");
        panneau_info_joueurs.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 70, 30));

        jLabel9.setText("- couleur :");
        panneau_info_joueurs.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 70, 20));

        lbl_J2_couleur.setText("couleurJoueur2");
        panneau_info_joueurs.add(lbl_J2_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 90, 20));

        jLabel10.setText("- désintegrateurs :");
        panneau_info_joueurs.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 100, 20));

        lbl_J2_desint.setText("nbDesintJoueur2");
        panneau_info_joueurs.add(lbl_J2_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 90, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Infos joueurs");
        panneau_info_joueurs.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 30));

        lbl_J2_nom.setText("nomJoueur2");
        panneau_info_joueurs.add(lbl_J2_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 60, 30));

        getContentPane().add(panneau_info_joueurs, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, 290, 250));

        setBounds(0, 0, 1044, 702);
    }// </editor-fold>//GEN-END:initComponents

    private void nom_joueur2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_joueur2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_joueur2ActionPerformed

    private void btn_col_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_0ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(0);
        if (grilleJeu.colonneRemplie(0) == true) {
            btn_col_0.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_0ActionPerformed

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        // TODO add your handling code here:
        panneau_info_joueurs.setVisible(true);
        panneau_info_partie.setVisible(true);
        initialiserPartie();
        panneau_grille.repaint();
        btn_start.setEnabled(false);
    }//GEN-LAST:event_btn_startActionPerformed

    private void btn_col_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_1ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(1);
        if (grilleJeu.colonneRemplie(1) == true) {
            btn_col_1.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_1ActionPerformed

    private void btn_col_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_2ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(2);
        if (grilleJeu.colonneRemplie(2) == true) {
            btn_col_2.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_2ActionPerformed

    private void btn_col_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_3ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(3);
        if (grilleJeu.colonneRemplie(3) == true) {
            btn_col_3.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_3ActionPerformed

    private void btn_col_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_4ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(4);
        if (grilleJeu.colonneRemplie(4) == true) {
            btn_col_4.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_4ActionPerformed

    private void btn_col_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_5ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(5);
        if (grilleJeu.colonneRemplie(5) == true) {
            btn_col_5.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_5ActionPerformed

    private void btn_col_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_6ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(6);
        if (grilleJeu.colonneRemplie(6) == true) {
            btn_col_6.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_6ActionPerformed

    public boolean jouerDansColonne(int indiceColonne) {
        boolean resAction;
        resAction = grilleJeu.ajouterJetonDansColonne(joueurCourant, indiceColonne);
        int ligneJetonPlace = ligneJetonJoue(indiceColonne);
        Cellule testTrouNoir = grilleJeu.CellulesJeu[ligneJetonPlace][indiceColonne];
        Cellule testDesintegrateur = grilleJeu.CellulesJeu[ligneJetonPlace][indiceColonne];
        boolean recupDesintegrateur;
        if (testDesintegrateur.presenceDesintegrateur() == true) {
            recupDesintegrateur = testDesintegrateur.recupererDesintegrateur();
            if (recupDesintegrateur == true) {
                joueurCourant.obtenirDesintegrateur();
            }
        }
        if (testTrouNoir.presenceTrouNoir() == true) {
            testTrouNoir.activerTrouNoir();
        }
        panneau_grille.repaint();

        lbl_J1_desint.setText(ListeJoueurs[0].nombreDesintegrateurs + "");
        lbl_J2_desint.setText(ListeJoueurs[1].nombreDesintegrateurs + "");

        boolean vict_J1 = grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0]);
        boolean vict_J2 = grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1]);
        if (vict_J1 && !vict_J2) {
            textemessage.setText("Victoire de " + ListeJoueurs[0].Nom);
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 7; j++) {
                    tabBoutons[i][j].setEnabled(false);
                }
            }
        }
        if (vict_J2 && !vict_J1) {
            textemessage.setText("Victoire de " + ListeJoueurs[1].Nom);
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 7; j++) {
                    tabBoutons[i][j].setEnabled(false);
                }
            }
        }
        if (vict_J1 && vict_J2) {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 7; j++) {
                    tabBoutons[i][j].setEnabled(false);
                }
            }
            if (joueurCourant == ListeJoueurs[0]) {
                textemessage.setText("Victoire de " + ListeJoueurs[1].Nom + " (faute de jeu)");
            } else {
                textemessage.setText("Victoire de " + ListeJoueurs[0].Nom + " (faute de jeu)");
            }
        }

        if (resAction == true) {
            return true;
        } else {
            return false;
        }
    }

    int ligneJetonJoue(int uneColonne) {
        int numColonne = uneColonne;
        int ligneJetonPlace = 0;
        for (int i = 0; i < 6; i++) { // On trouve la ligne où le jeton a été placé
            boolean testRemplie = grilleJeu.colonneRemplie(numColonne);
            if (testRemplie == true) {
                ligneJetonPlace = 5;
                break;
            } else {
                boolean testCellule1 = grilleJeu.celluleOccupee(i, numColonne);
                boolean testCellule2 = grilleJeu.celluleOccupee(i + 1, numColonne);
                if ((testCellule1 == true) && (testCellule2 == false)) {
                    ligneJetonPlace = i;
                    break;
                }
            }
        }
        return ligneJetonPlace;
    }

    public void joueurSuivant() {
        if (joueurCourant == ListeJoueurs[0]) {
            joueurCourant = ListeJoueurs[1];
            lbl_JCourant.setText(joueurCourant.Nom);
        } else {
            joueurCourant = ListeJoueurs[0];
            lbl_JCourant.setText(joueurCourant.Nom);
        }
    }

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
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetreDeJeu().setVisible(true);
            }
        });
    }

    void initialiserPartie() {
        //grilleJeu = new Grille(); // On crée la grille vide de début de partie

        // On crée deux joueurs
        System.out.println("Bienvenue ! La partie va commencer.");

        String nomJoueur1 = nom_joueur1.getText();
        Joueur joueur1 = new Joueur(nomJoueur1);

        String nomJoueur2 = nom_joueur2.getText();
        Joueur joueur2 = new Joueur(nomJoueur2);

        ListeJoueurs[0] = joueur1;
        ListeJoueurs[1] = joueur2;
        attribuerCouleursAuxJoueurs();
        joueurCourant = ListeJoueurs[0];

        System.out.println(joueur1.Nom + " est de couleur " + joueur1.Couleur);
        System.out.println(joueur2.Nom + " est de couleur " + joueur2.Couleur);

        lbl_J1_nom.setText(nomJoueur1);
        lbl_J2_nom.setText(nomJoueur2);
        lbl_J1_couleur.setText(joueur1.Couleur);
        lbl_J2_couleur.setText(joueur2.Couleur);
        lbl_J1_desint.setText(joueur1.nombreDesintegrateurs + "");
        lbl_J2_desint.setText(joueur2.nombreDesintegrateurs + "");
        lbl_JCourant.setText(joueurCourant.Nom);

        for (int i = 0; i < 21; i++) { // On crée les 21 jetons de chaque couleur pour les joueurs
            if (ListeJoueurs[0].Couleur == "Rouge") {
                Jeton JetonJoueur1 = new Jeton("Rouge");
                ListeJoueurs[0].ajouterJeton(JetonJoueur1); // On ajoute chaque jeton à la liste de jetons du joueur

                Jeton JetonJoueur2 = new Jeton("Jaune");
                ListeJoueurs[1].ajouterJeton(JetonJoueur2);
            }

            if (ListeJoueurs[0].Couleur == "Jaune") {
                Jeton JetonJoueur1 = new Jeton("Jaune");
                ListeJoueurs[0].ajouterJeton(JetonJoueur1);

                Jeton JetonJoueur2 = new Jeton("Rouge");
                ListeJoueurs[1].ajouterJeton(JetonJoueur2);
            }
            ListeJoueurs[1].nombreJetonsRestants = 21;
            ListeJoueurs[0].nombreJetonsRestants = 21;
        }

        int colHasard;
        int ligneHasard;
        int compteurDes = 0;
        while (compteurDes != 3) {
            colHasard = (int) (Math.random() * 6); // On définit un nombre au hasard entre 0 et 6
            ligneHasard = (int) (Math.random() * 5);
            if (grilleJeu.CellulesJeu[ligneHasard][colHasard].presenceDesintegrateur() == false) {
                grilleJeu.placerDesintegrateur(ligneHasard, colHasard);
                compteurDes += 1;
            }
        }

        int compteurTrou = 0;
        while (compteurTrou != 5) {
            colHasard = (int) (Math.random() * 6); // On définit un nombre au hasard entre 0 et 6
            ligneHasard = (int) (Math.random() * 5);
            if ((grilleJeu.CellulesJeu[ligneHasard][colHasard].presenceTrouNoir() == false) && (grilleJeu.CellulesJeu[ligneHasard][colHasard].presenceDesintegrateur() == false)) {
                grilleJeu.placerTrouNoir(ligneHasard, colHasard);
                compteurTrou += 1;
                if (compteurTrou == 1) {
                    grilleJeu.placerDesintegrateur(ligneHasard, colHasard);
                }
                if (compteurTrou == 4) {
                    grilleJeu.placerDesintegrateur(ligneHasard, colHasard);
                }
            }
        }

    }

    void attribuerCouleursAuxJoueurs() {
        int nbale;
        nbale = (int) (Math.random() * 100); // On définit un nombre au hasard entre 1 et 100
        if (nbale % 2 == 0) { // Si le nombre est pair, le joueur 1 a les rouges et le joueur 2 les jaunes
            ListeJoueurs[0].affecterCouleur("Rouge");
            ListeJoueurs[1].affecterCouleur("Jaune");
        } else {
            ListeJoueurs[0].affecterCouleur("Jaune");
            ListeJoueurs[1].affecterCouleur("Rouge");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_col_0;
    private javax.swing.JButton btn_col_1;
    private javax.swing.JButton btn_col_2;
    private javax.swing.JButton btn_col_3;
    private javax.swing.JButton btn_col_4;
    private javax.swing.JButton btn_col_5;
    private javax.swing.JButton btn_col_6;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_J1_couleur;
    private javax.swing.JLabel lbl_J1_desint;
    private javax.swing.JLabel lbl_J1_nom;
    private javax.swing.JLabel lbl_J2_couleur;
    private javax.swing.JLabel lbl_J2_desint;
    private javax.swing.JLabel lbl_J2_nom;
    private javax.swing.JLabel lbl_JCourant;
    private javax.swing.JScrollPane message;
    private javax.swing.JTextField nom_joueur1;
    private javax.swing.JTextField nom_joueur2;
    private javax.swing.JPanel panneau_creation_partie;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_info_joueurs;
    private javax.swing.JPanel panneau_info_partie;
    private javax.swing.JTextArea textemessage;
    // End of variables declaration//GEN-END:variables
}
