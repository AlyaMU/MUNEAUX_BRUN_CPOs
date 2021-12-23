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
    Grille grilleTest = new Grille();
    CelluleGraphique[][] tabCases = new CelluleGraphique[6][7];
    int mode = 0;
    Joueur leJoueur = new Joueur();

    public MUNEAUX_BRUN_LightsOut() {
        initComponents();
        panneau_chrono_nb_coup.setVisible(false);
        panneau_nom_bonus.setVisible(true);
        btn_Demarrer.setEnabled(false);
        String nomJoueur = nom_joueur.getText();
        leJoueur.nom = nomJoueur;
        nb_bonus.setText(leJoueur.nbbonus+"");
        nb_coups.setText(leJoueur.nbcoups+"");
        
        for (int li = 4; li >= 0; li--) {
            for (int col = 0; col < 5; col++) {
                CelluleGraphique cellGraph = new CelluleGraphique(grilleTest.CellulesJeu[li][col]);
                tabCases[li][col] = cellGraph;
                panneau_grille.add(cellGraph);
                int ligne = li;
                int colonne = col;
                // Arrêt du jeu
                System.out.println(nbSecondes);
                if (nbSecondes == 120 && mode == 2) {
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            tabCases[i][j].setEnabled(false);
                        }
                    }
                    monChrono.stop();
                    Fenetre_Victoire victoire = new Fenetre_Victoire();
                    victoire.setVisible(true);
                    panneau_grille.repaint();
                }
                cellGraph.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        if (mode == 1) {
                            grilleTest.changerCase(ligne, colonne);
                            if (ligne != 4) {
                                grilleTest.changerCase(ligne + 1, colonne);
                            }
                            if (ligne != 0) {
                                grilleTest.changerCase(ligne - 1, colonne);
                            }
                            if (colonne != 4) {
                                grilleTest.changerCase(ligne, colonne + 1);
                            }
                            if (colonne != 0) {
                                grilleTest.changerCase(ligne, colonne - 1);
                            }
                        }
                        else if (mode == 2) {
                            grilleTest.changerCase(ligne, colonne);
                            if (ligne != 4) {
                                grilleTest.changerCase(ligne + 1, colonne);
                            }
                            if (ligne != 0) {
                                grilleTest.changerCase(ligne - 1, colonne);
                            }
                            if (colonne != 4) {
                                grilleTest.changerCase(ligne, colonne + 1);
                            }
                            if (colonne != 0) {
                                grilleTest.changerCase(ligne, colonne - 1);
                            }
                        }
                        else {
                            if ("Rouge".equals(cellGraph.celluleAssociee.couleur)) {
                                grilleTest.changerCase(ligne, colonne);
                                grilleTest.CellulesJeu[ligne][colonne].couleur = null;
                                if (ligne != 4 && !"Jaune".equals(grilleTest.CellulesJeu[ligne+1][colonne].couleur)) {
                                    grilleTest.changerCase(ligne + 1, colonne);
                                    if(grilleTest.CellulesJeu[ligne+1][colonne].etatCellule() == true) {
                                      grilleTest.CellulesJeu[ligne+1][colonne].couleurRouge();  
                                    }
                                }
                                if (ligne != 0 && !"Jaune".equals(grilleTest.CellulesJeu[ligne-1][colonne].couleur)) {
                                    grilleTest.changerCase(ligne - 1, colonne);
                                    if(grilleTest.CellulesJeu[ligne-1][colonne].etatCellule() == true) {
                                       grilleTest.CellulesJeu[ligne-1][colonne].couleurRouge(); 
                                    }
                                }
                                if (colonne != 4 && !"Jaune".equals(grilleTest.CellulesJeu[ligne][colonne+1].couleur)) {
                                    grilleTest.changerCase(ligne, colonne + 1);
                                    if (grilleTest.CellulesJeu[ligne][colonne+1].etatCellule() == true) {
                                        grilleTest.CellulesJeu[ligne][colonne+1].couleurRouge();   
                                    }
                                }
                                if (colonne != 0 && !"Jaune".equals(grilleTest.CellulesJeu[ligne][colonne-1].couleur)) {
                                    grilleTest.changerCase(ligne, colonne - 1);
                                    if (grilleTest.CellulesJeu[ligne][colonne-1].etatCellule() == true) {
                                        grilleTest.CellulesJeu[ligne][colonne-1].couleurRouge();   
                                    }
                                }
                            }
                            else if ("Jaune".equals(cellGraph.celluleAssociee.couleur)) {
                                grilleTest.changerCase(ligne, colonne);
                                grilleTest.CellulesJeu[ligne][colonne].couleur = null;
                                if (ligne != 4 && !"Rouge".equals(grilleTest.CellulesJeu[ligne+1][colonne].couleur)) {
                                    grilleTest.changerCase(ligne + 1, colonne);
                                    if(grilleTest.CellulesJeu[ligne+1][colonne].etatCellule() == true) {
                                       grilleTest.CellulesJeu[ligne+1][colonne].couleurJaune(); 
                                    } 
                                }
                                if (ligne != 0 && !"Rouge".equals(grilleTest.CellulesJeu[ligne-1][colonne].couleur)) {
                                    grilleTest.changerCase(ligne - 1, colonne);
                                    if(grilleTest.CellulesJeu[ligne-1][colonne].etatCellule() == true) {
                                        grilleTest.CellulesJeu[ligne-1][colonne].couleurJaune();
                                    }
                                }
                                if (colonne != 4 && !"Rouge".equals(grilleTest.CellulesJeu[ligne][colonne+1].couleur)) {
                                    grilleTest.changerCase(ligne, colonne + 1);
                                    if (grilleTest.CellulesJeu[ligne][colonne+1].etatCellule() == true) {
                                        grilleTest.CellulesJeu[ligne][colonne+1].couleurJaune();   
                                    }
                                }
                                if (colonne != 0 && !"Rouge".equals(grilleTest.CellulesJeu[ligne][colonne-1].couleur)) {
                                    grilleTest.changerCase(ligne, colonne - 1);
                                    if (grilleTest.CellulesJeu[ligne][colonne-1].etatCellule() == true) {
                                        grilleTest.CellulesJeu[ligne][colonne-1].couleurJaune();   
                                    }
                                }
                            }
                            else {
                                int couleurHasard = (int) (Math.random() * 1);
                                if (couleurHasard == 0) {
                                    grilleTest.changerCase(ligne, colonne);
                                    grilleTest.CellulesJeu[ligne][colonne].couleur = "Rouge";
                                    if (ligne != 4 && !"Jaune".equals(grilleTest.CellulesJeu[ligne+1][colonne].couleur)) {
                                        grilleTest.changerCase(ligne + 1, colonne);
                                        if(grilleTest.CellulesJeu[ligne+1][colonne].etatCellule() == true) {
                                            grilleTest.CellulesJeu[ligne+1][colonne].couleurRouge();
                                        }
                                    }
                                    if (ligne != 0 && !"Jaune".equals(grilleTest.CellulesJeu[ligne-1][colonne].couleur)) {
                                        grilleTest.changerCase(ligne - 1, colonne);
                                        if(grilleTest.CellulesJeu[ligne-1][colonne].etatCellule() == true) {
                                            grilleTest.CellulesJeu[ligne-1][colonne].couleurRouge();
                                        }
                                    }
                                    if (colonne != 4 && !"Jaune".equals(grilleTest.CellulesJeu[ligne][colonne+1].couleur)) {
                                        grilleTest.changerCase(ligne, colonne + 1);
                                        if (grilleTest.CellulesJeu[ligne][colonne+1].etatCellule() == true) {
                                            grilleTest.CellulesJeu[ligne][colonne+1].couleurRouge();
                                        }
                                    }
                                    if (colonne != 0 && !"Jaune".equals(grilleTest.CellulesJeu[ligne][colonne-1].couleur)) {
                                        grilleTest.changerCase(ligne, colonne - 1);
                                        if (grilleTest.CellulesJeu[ligne][colonne-1].etatCellule() == true) {
                                            grilleTest.CellulesJeu[ligne][colonne-1].couleurRouge();
                                        }
                                    }
                                }
                                else {
                                    grilleTest.changerCase(ligne, colonne);
                                    grilleTest.CellulesJeu[ligne][colonne].couleur = "Jaune";
                                    if (ligne != 4 && !"Rouge".equals(grilleTest.CellulesJeu[ligne+1][colonne].couleur)) {
                                        grilleTest.changerCase(ligne + 1, colonne);
                                        if(grilleTest.CellulesJeu[ligne+1][colonne].etatCellule() == true) {
                                            grilleTest.CellulesJeu[ligne+1][colonne].couleurJaune();
                                        }  
                                    }
                                    if (ligne != 0 && !"Rouge".equals(grilleTest.CellulesJeu[ligne-1][colonne].couleur)) {
                                        grilleTest.changerCase(ligne - 1, colonne);
                                        if(grilleTest.CellulesJeu[ligne-1][colonne].etatCellule() == true) {
                                            grilleTest.CellulesJeu[ligne-1][colonne].couleurJaune();
                                        }
                                    }
                                    if (colonne != 4 && !"Rouge".equals(grilleTest.CellulesJeu[ligne][colonne+1].couleur)) {
                                        grilleTest.changerCase(ligne, colonne + 1);
                                        if (grilleTest.CellulesJeu[ligne][colonne+1].etatCellule() == true) {
                                            grilleTest.CellulesJeu[ligne][colonne+1].couleurJaune();
                                        }
                                    }
                                    if (colonne != 0 && !"Rouge".equals(grilleTest.CellulesJeu[ligne][colonne-1].couleur)) {
                                        grilleTest.changerCase(ligne, colonne - 1);
                                        if (grilleTest.CellulesJeu[ligne][colonne-1].etatCellule() == true) {
                                           grilleTest.CellulesJeu[ligne][colonne-1].couleurJaune(); 
                                        }
                                    }
                                }
                            }
                        }
                        leJoueur.augmenterCoups();
                        boolean presBonus = grilleTest.CellulesJeu[ligne][colonne].bonus;
                        if (presBonus == true) {
                            leJoueur.ajouterBonus();
                            grilleTest.CellulesJeu[ligne][colonne].bonus = false;
                        }
                        nb_bonus.setText(leJoueur.nbbonus+"");
                        nb_coups.setText(leJoueur.nbcoups+"");
                        grilleTest.afficherGrilleSurConsole();
                        panneau_grille.repaint();
                        if (true == grilleTest.grilleGagnante()) {
                            for (int i = 0; i < 5; i++) {
                                for (int j = 0; j < 5; j++) {
                                    tabCases[i][j].setEnabled(false);
                                }
                            }
                            monChrono.stop();
                            Fenetre_Victoire victoire = new Fenetre_Victoire();
                            victoire.setVisible(true);
                        }
                        panneau_grille.repaint();
                    }
                });
            }
        }
    }

    ActionListener tache_recurrente = new ActionListener() {
        public void actionPerformed(ActionEvent e1) {
            nbSecondes++;
            txt_chrono.setText(nbSecondes + "");
            if (nbSecondes == 120 && mode == 2) {
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        tabCases[i][j].setEnabled(false);
                    }
                }
                monChrono.stop();
                Fenetre_Defaite defaite = new Fenetre_Defaite();
                defaite.setVisible(true);
                panneau_grille.repaint();
            }
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
        btn_col1 = new javax.swing.JButton();
        btn_col2 = new javax.swing.JButton();
        btn_col3 = new javax.swing.JButton();
        btn_col4 = new javax.swing.JButton();
        btn_col5 = new javax.swing.JButton();
        btn_li1 = new javax.swing.JButton();
        btn_li2 = new javax.swing.JButton();
        btn_li3 = new javax.swing.JButton();
        btn_li4 = new javax.swing.JButton();
        btn_li5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(255, 255, 255));
        panneau_grille.setLayout(new java.awt.GridLayout(5, 5));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 590, 560));

        panneau_nom_bonus.setBackground(new java.awt.Color(20, 121, 246));
        panneau_nom_bonus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel2.setText("Nom du Joueur :");
        panneau_nom_bonus.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel3.setText("Information du Joueur");
        panneau_nom_bonus.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel10.setText("Nombre de bonus :");
        panneau_nom_bonus.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        nb_bonus.setText("nb_bonus");
        panneau_nom_bonus.add(nb_bonus, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 60, 20));

        nom_joueur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_joueurActionPerformed(evt);
            }
        });
        panneau_nom_bonus.add(nom_joueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 70, -1));

        getContentPane().add(panneau_nom_bonus, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, 360, 210));

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

        getContentPane().add(panneau_difficulteEtDemarrer, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 360, 130));

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
        panneau_chrono_nb_coup.add(txt_chrono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 80, 40));

        nb_coups.setText("nb_coups");
        panneau_chrono_nb_coup.add(nb_coups, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        getContentPane().add(panneau_chrono_nb_coup, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 450, 360, 200));

        btn_col1.setText("1");
        btn_col1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 110, 30));

        btn_col2.setText("2");
        btn_col2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 110, 30));

        btn_col3.setText("3");
        btn_col3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 110, 30));

        btn_col4.setText("4");
        btn_col4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 110, 30));

        btn_col5.setText("5");
        btn_col5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 110, 30));

        btn_li1.setText("1");
        btn_li1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_li1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_li1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 40, 100));

        btn_li2.setText("2");
        btn_li2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_li2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_li2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 40, 100));

        btn_li3.setText("3");
        btn_li3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_li3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_li3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 40, 100));

        btn_li4.setText("4");
        btn_li4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_li4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_li4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, 100));

        btn_li5.setText("5");
        btn_li5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_li5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_li5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 40, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_NormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NormalActionPerformed
        btn_Normal.setEnabled(false);
        btn_Montre.setEnabled(false);
        btn_FeteCouleur.setEnabled(false);
        btn_Demarrer.setEnabled(true);
        Consigne_Normal Normal = new Consigne_Normal();
        Normal.setVisible(true);
        mode = 1;
        modeNormal();
        placementBonus();
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
        feteCouleur.setVisible(true);
        btn_Normal.setEnabled(false);
        btn_Montre.setEnabled(false);
        btn_FeteCouleur.setEnabled(false);
        btn_Demarrer.setEnabled(true);
        mode = 3;
        modeCouleurs();
        placementBonus();
    }//GEN-LAST:event_btn_FeteCouleurActionPerformed

    private void btn_MontreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MontreActionPerformed
        Consigne_Montre Montre = new Consigne_Montre();
        btn_Normal.setEnabled(false);
        btn_Montre.setEnabled(false);
        btn_FeteCouleur.setEnabled(false);
        btn_Demarrer.setEnabled(true);
        Montre.setVisible(true);
        mode = 2;
        modeMontre();
        placementBonus();
    }//GEN-LAST:event_btn_MontreActionPerformed

    private void nom_joueurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_joueurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_joueurActionPerformed

    private void btn_col3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col3ActionPerformed
        // TODO add your handling code here:
        if (leJoueur.nbbonus != 0) {
            grilleTest.bonusColonne(2);
            leJoueur.nbbonus -= 1;
        }
        if (true == grilleTest.grilleGagnante()) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    tabCases[i][j].setEnabled(false);
                }
            }
            monChrono.stop();
            Fenetre_Victoire victoire = new Fenetre_Victoire();
            victoire.setVisible(true);
        }
        nb_bonus.setText(leJoueur.nbbonus+"");
        panneau_grille.repaint();
    }//GEN-LAST:event_btn_col3ActionPerformed

    private void btn_col5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col5ActionPerformed
        // TODO add your handling code here:
        if (leJoueur.nbbonus != 0) {
            grilleTest.bonusColonne(4);
            leJoueur.nbbonus -= 1;
        }
        if (true == grilleTest.grilleGagnante()) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    tabCases[i][j].setEnabled(false);
                }
            }
            monChrono.stop();
            Fenetre_Victoire victoire = new Fenetre_Victoire();
            victoire.setVisible(true);
        }
        nb_bonus.setText(leJoueur.nbbonus+"");
        panneau_grille.repaint();
    }//GEN-LAST:event_btn_col5ActionPerformed

    private void btn_col4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col4ActionPerformed
        // TODO add your handling code here:
        if (leJoueur.nbbonus != 0) {
            grilleTest.bonusColonne(3);
            leJoueur.nbbonus -= 1;
        }
        if (true == grilleTest.grilleGagnante()) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    tabCases[i][j].setEnabled(false);
                }
            }
            monChrono.stop();
            Fenetre_Victoire victoire = new Fenetre_Victoire();
            victoire.setVisible(true);
        }
        nb_bonus.setText(leJoueur.nbbonus+"");
        panneau_grille.repaint();
    }//GEN-LAST:event_btn_col4ActionPerformed

    private void btn_col1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col1ActionPerformed
        // TODO add your handling code here:
        if (leJoueur.nbbonus != 0) {
            grilleTest.bonusColonne(0);
            leJoueur.nbbonus -= 1;
        }
        if (true == grilleTest.grilleGagnante()) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    tabCases[i][j].setEnabled(false);
                }
            }
            monChrono.stop();
            Fenetre_Victoire victoire = new Fenetre_Victoire();
            victoire.setVisible(true);
        }
        nb_bonus.setText(leJoueur.nbbonus+"");
        panneau_grille.repaint();
    }//GEN-LAST:event_btn_col1ActionPerformed

    private void btn_col2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col2ActionPerformed
        // TODO add your handling code here:
        if (leJoueur.nbbonus != 0) {
            grilleTest.bonusColonne(1);
            leJoueur.nbbonus -= 1;
        }
        if (true == grilleTest.grilleGagnante()) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    tabCases[i][j].setEnabled(false);
                }
            }
            monChrono.stop();
            Fenetre_Victoire victoire = new Fenetre_Victoire();
            victoire.setVisible(true);
        }
        nb_bonus.setText(leJoueur.nbbonus+"");
        panneau_grille.repaint();
    }//GEN-LAST:event_btn_col2ActionPerformed

    private void btn_li1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_li1ActionPerformed
        // TODO add your handling code here:
        if (leJoueur.nbbonus != 0) {
            grilleTest.bonusLigne(4);
            leJoueur.nbbonus -= 1;
        }
        if (true == grilleTest.grilleGagnante()) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    tabCases[i][j].setEnabled(false);
                }
            }
            monChrono.stop();
            Fenetre_Victoire victoire = new Fenetre_Victoire();
            victoire.setVisible(true);
        }
        nb_bonus.setText(leJoueur.nbbonus+"");
        panneau_grille.repaint();
    }//GEN-LAST:event_btn_li1ActionPerformed

    private void btn_li2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_li2ActionPerformed
        // TODO add your handling code here:
        if (leJoueur.nbbonus != 0) {
            grilleTest.bonusLigne(3);
            leJoueur.nbbonus -= 1;
        }
        if (true == grilleTest.grilleGagnante()) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    tabCases[i][j].setEnabled(false);
                }
            }
            monChrono.stop();
            Fenetre_Victoire victoire = new Fenetre_Victoire();
            victoire.setVisible(true);
        }
        nb_bonus.setText(leJoueur.nbbonus+"");
        panneau_grille.repaint();
    }//GEN-LAST:event_btn_li2ActionPerformed

    private void btn_li3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_li3ActionPerformed
        // TODO add your handling code here:
        if (leJoueur.nbbonus != 0) {
            grilleTest.bonusLigne(2);
            leJoueur.nbbonus -= 1;
        }
        if (true == grilleTest.grilleGagnante()) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    tabCases[i][j].setEnabled(false);
                }
            }
            monChrono.stop();
            Fenetre_Victoire victoire = new Fenetre_Victoire();
            victoire.setVisible(true);
        }
        nb_bonus.setText(leJoueur.nbbonus+"");
        panneau_grille.repaint();
    }//GEN-LAST:event_btn_li3ActionPerformed

    private void btn_li4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_li4ActionPerformed
        // TODO add your handling code here:
        if (leJoueur.nbbonus != 0) {
            grilleTest.bonusLigne(1);
            leJoueur.nbbonus -= 1;
        }
        if (true == grilleTest.grilleGagnante()) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    tabCases[i][j].setEnabled(false);
                }
            }
            monChrono.stop();
            Fenetre_Victoire victoire = new Fenetre_Victoire();
            victoire.setVisible(true);
        }
        nb_bonus.setText(leJoueur.nbbonus+"");
        panneau_grille.repaint();
    }//GEN-LAST:event_btn_li4ActionPerformed

    private void btn_li5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_li5ActionPerformed
        // TODO add your handling code here:
        if (leJoueur.nbbonus != 0) {
            grilleTest.bonusLigne(0);
            leJoueur.nbbonus -= 1;
        }
        if (true == grilleTest.grilleGagnante()) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    tabCases[i][j].setEnabled(false);
                }
            }
            monChrono.stop();
            Fenetre_Victoire victoire = new Fenetre_Victoire();
            victoire.setVisible(true);
        }
        nb_bonus.setText(leJoueur.nbbonus+"");
        panneau_grille.repaint();
    }//GEN-LAST:event_btn_li5ActionPerformed

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

    void modeNormal() {
        int colHasard;
        int ligneHasard;
        int compteurCase = 0;
        while (compteurCase != 5) {
            colHasard = (int) (Math.random() * 4); // On définit un nombre au hasard entre 0 et 4
            ligneHasard = (int) (Math.random() * 4);
            if (grilleTest.CellulesJeu[ligneHasard][colHasard].etatCellule() == false) {
                grilleTest.changerCase(ligneHasard, colHasard);
                compteurCase += 1;
            }
        }
        System.out.println("La partie peut commmencer");
        grilleTest.afficherGrilleSurConsole();
    }

    void modeMontre() {
        int colHasard;
        int ligneHasard;
        int compteurCase = 0;
        while (compteurCase != 5) {
            colHasard = (int) (Math.random() * 4); // On définit un nombre au hasard entre 0 et 4
            ligneHasard = (int) (Math.random() * 4);
            if (grilleTest.CellulesJeu[ligneHasard][colHasard].etatCellule() == false) {
                grilleTest.changerCase(ligneHasard, colHasard);
                compteurCase += 1;
            }
        }
        System.out.println("La partie peut commmencer");
        grilleTest.afficherGrilleSurConsole();
    }

    void modeCouleurs() {
        int colHasard;
        int ligneHasard;
        int compteurCase1 = 0;
        int compteurCase2 = 0;
        while (compteurCase1 != 3) {
            colHasard = (int) (Math.random() * 4); // On définit un nombre au hasard entre 0 et 2
            ligneHasard = (int) (Math.random() * 4);
            if (grilleTest.CellulesJeu[ligneHasard][colHasard].etatCellule() == false) {
                grilleTest.changerCase(ligneHasard, colHasard);
                grilleTest.CellulesJeu[ligneHasard][colHasard].couleurRouge();
                compteurCase1 += 1;
            }
        }
        // Problème de boucle infinie pour la "while" en dessous
        while (compteurCase2 != 3) {
            colHasard = (int) (Math.random() * 4); // On définit un nombre au hasard entre 0 et 2
            ligneHasard = (int) (Math.random() * 4);
            if (grilleTest.CellulesJeu[ligneHasard][colHasard].etatCellule() == false) {
                grilleTest.changerCase(ligneHasard, colHasard);
                grilleTest.CellulesJeu[ligneHasard][colHasard].couleurJaune();
                compteurCase2 += 1;
            }
        }
        System.out.println("La partie peut commmencer");
        grilleTest.afficherGrilleSurConsole();
    }
    
    void placementBonus() {
        int colHasard;
        int ligneHasard;
        int compteurCase = 0;
        while (compteurCase != 5) {
            colHasard = (int) (Math.random() * 4); // On définit un nombre au hasard entre 0 et 4
            ligneHasard = (int) (Math.random() * 4);
            if (grilleTest.CellulesJeu[ligneHasard][colHasard].bonus == false) {
                grilleTest.CellulesJeu[ligneHasard][colHasard].bonus = true;
                compteurCase += 1;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Demarrer;
    private javax.swing.JButton btn_FeteCouleur;
    private javax.swing.JButton btn_Montre;
    private javax.swing.JButton btn_Normal;
    private javax.swing.JButton btn_col1;
    private javax.swing.JButton btn_col2;
    private javax.swing.JButton btn_col3;
    private javax.swing.JButton btn_col4;
    private javax.swing.JButton btn_col5;
    private javax.swing.JButton btn_li1;
    private javax.swing.JButton btn_li2;
    private javax.swing.JButton btn_li3;
    private javax.swing.JButton btn_li4;
    private javax.swing.JButton btn_li5;
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