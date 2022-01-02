/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muneaux_brun_lightsout;

import java.util.ArrayList;

/**
 *
 * @author Mathilde
 */
public class Tableaux_scores extends javax.swing.JFrame {

    /**
     * Creates new form Tableaux_scores
     */
    public Tableaux_scores(){
        
    }
    public Tableaux_scores(String leJoueur,int nbcoups,int nbSecondes) {
        Joueur unJoueur = new Joueur();
        unJoueur.nom = leJoueur;
        unJoueur.nbcoups = nbcoups;
        int nmbSecondes = nbSecondes;
        initComponents();
        FichierLu monFichier = new FichierLu();
        monFichier.creerFichier();
        monFichier.ecrireFichier(unJoueur.nom,unJoueur.nbcoups+"",nmbSecondes+"");
        monFichier.lireFichier();
        ArrayList<String> newCoupsParties = new ArrayList<String>();
        newCoupsParties = monFichier.envoieCoupsPartie();
        ArrayList<String> newChronoParties = new ArrayList<String>();
        newChronoParties = monFichier.envoieChronoParties();
        if (newChronoParties.size()==1 && newCoupsParties.size()==1){
            String sec1 = newChronoParties.get(0);
            nb_sec1.setText(sec1);
            nb_sec2.setText("");
            nb_sec3.setText("");
            nb_sec4.setText("");
            nb_sec5.setText("");
            nb_sec6.setText("");
            nb_sec7.setText("");
            nb_sec8.setText("");
            nb_sec9.setText("");
            nb_sec10.setText("");
            String nom1 = newCoupsParties.get(0);
            nb_coups1.setText(nom1);
            nb_coups2.setText("");
            nb_coups3.setText("");
            nb_coups4.setText("");
            nb_coups5.setText("");
            nb_coups6.setText("");
            nb_coups7.setText("");
            nb_coups8.setText("");
            nb_coups9.setText("");
            nb_coups10.setText("");
        }
        
        else if (newChronoParties.size()==2 && newCoupsParties.size()==2){
            String sec1 = newChronoParties.get(0);
            String sec2 = newChronoParties.get(1);
            nb_sec1.setText(sec1);
            nb_sec2.setText(sec2);
            nb_sec3.setText("");
            nb_sec4.setText("");
            nb_sec5.setText("");
            nb_sec6.setText("");
            nb_sec7.setText("");
            nb_sec8.setText("");
            nb_sec9.setText("");
            nb_sec10.setText("");
            String nom1 = newCoupsParties.get(0);
            String nom2 = newCoupsParties.get(1);
            nb_coups1.setText(nom1);
            nb_coups2.setText(nom2);
            nb_coups3.setText("");
            nb_coups4.setText("");
            nb_coups5.setText("");
            nb_coups6.setText("");
            nb_coups7.setText("");
            nb_coups8.setText("");
            nb_coups9.setText("");
            nb_coups10.setText("");
        }
        
        else if (newChronoParties.size()==3 && newCoupsParties.size()==3){
            String sec1 = newChronoParties.get(0);
            String sec2 = newChronoParties.get(1);
            String sec3 = newChronoParties.get(2);
            nb_sec1.setText(sec1);
            nb_sec2.setText(sec2);
            nb_sec3.setText(sec3);
            nb_sec4.setText("");
            nb_sec5.setText("");
            nb_sec6.setText("");
            nb_sec7.setText("");
            nb_sec8.setText("");
            nb_sec9.setText("");
            nb_sec10.setText("");
            String nom1 = newCoupsParties.get(0);
            String nom2 = newCoupsParties.get(1);
            String nom3 = newCoupsParties.get(2);
            nb_coups1.setText(nom1);
            nb_coups2.setText(nom2);
            nb_coups3.setText(nom3);
            nb_coups4.setText("");
            nb_coups5.setText("");
            nb_coups6.setText("");
            nb_coups7.setText("");
            nb_coups8.setText("");
            nb_coups9.setText("");
            nb_coups10.setText("");
        }
        else if (newChronoParties.size()==4 && newCoupsParties.size()==4){
            String sec1 = newChronoParties.get(0);
            String sec2 = newChronoParties.get(1);
            String sec3 = newChronoParties.get(2);
            String sec4 = newChronoParties.get(3);
            nb_sec1.setText(sec1);
            nb_sec2.setText(sec2);
            nb_sec3.setText(sec3);
            nb_sec4.setText(sec4);
            nb_sec5.setText("");
            nb_sec6.setText("");
            nb_sec7.setText("");
            nb_sec8.setText("");
            nb_sec9.setText("");
            nb_sec10.setText("");
            String nom1 = newCoupsParties.get(0);
            String nom2 = newCoupsParties.get(1);
            String nom3 = newCoupsParties.get(2);
            String nom4 = newCoupsParties.get(3);
            nb_coups1.setText(nom1);
            nb_coups2.setText(nom2);
            nb_coups3.setText(nom3);
            nb_coups4.setText(nom4);
            nb_coups5.setText("");
            nb_coups6.setText("");
            nb_coups7.setText("");
            nb_coups8.setText("");
            nb_coups9.setText("");
            nb_coups10.setText("");
        }
        else if (newChronoParties.size()==5 && newCoupsParties.size()==5){
            String sec1 = newChronoParties.get(0);
            String sec2 = newChronoParties.get(1);
            String sec3 = newChronoParties.get(2);
            String sec4 = newChronoParties.get(3);
            String sec5 = newChronoParties.get(4);
            nb_sec1.setText(sec1);
            nb_sec2.setText(sec2);
            nb_sec3.setText(sec3);
            nb_sec4.setText(sec4);
            nb_sec5.setText(sec5);
            nb_sec6.setText("");
            nb_sec7.setText("");
            nb_sec8.setText("");
            nb_sec9.setText("");
            nb_sec10.setText("");
            String nom1 = newCoupsParties.get(0);
            String nom2 = newCoupsParties.get(1);
            String nom3 = newCoupsParties.get(2);
            String nom4 = newCoupsParties.get(3);
            String nom5 = newCoupsParties.get(4);
            nb_coups1.setText(nom1);
            nb_coups2.setText(nom2);
            nb_coups3.setText(nom3);
            nb_coups4.setText(nom4);
            nb_coups5.setText(nom5);
            nb_coups6.setText("");
            nb_coups7.setText("");
            nb_coups8.setText("");
            nb_coups9.setText("");
            nb_coups10.setText("");
        }
        else if (newChronoParties.size()==6 && newCoupsParties.size()==6){
            String sec1 = newChronoParties.get(0);
            String sec2 = newChronoParties.get(1);
            String sec3 = newChronoParties.get(2);
            String sec4 = newChronoParties.get(3);
            String sec5 = newChronoParties.get(4);
            String sec6 = newChronoParties.get(5);
            nb_sec1.setText(sec1);
            nb_sec2.setText(sec2);
            nb_sec3.setText(sec3);
            nb_sec4.setText(sec4);
            nb_sec5.setText(sec5);
            nb_sec6.setText(sec6);
            nb_sec7.setText("");
            nb_sec8.setText("");
            nb_sec9.setText("");
            nb_sec10.setText("");
            String nom1 = newCoupsParties.get(0);
            String nom2 = newCoupsParties.get(1);
            String nom3 = newCoupsParties.get(2);
            String nom4 = newCoupsParties.get(3);
            String nom5 = newCoupsParties.get(4);
            String nom6 = newCoupsParties.get(5);
            nb_coups1.setText(nom1);
            nb_coups2.setText(nom2);
            nb_coups3.setText(nom3);
            nb_coups4.setText(nom4);
            nb_coups5.setText(nom5);
            nb_coups6.setText(nom6);
            nb_coups7.setText("");
            nb_coups8.setText("");
            nb_coups9.setText("");
            nb_coups10.setText("");
        }
        else if (newChronoParties.size()==7 && newCoupsParties.size()==7){
            String sec1 = newChronoParties.get(0);
            String sec2 = newChronoParties.get(1);
            String sec3 = newChronoParties.get(2);
            String sec4 = newChronoParties.get(3);
            String sec5 = newChronoParties.get(4);
            String sec6 = newChronoParties.get(5);
            String sec7 = newChronoParties.get(6);
            nb_sec1.setText(sec1);
            nb_sec2.setText(sec2);
            nb_sec3.setText(sec3);
            nb_sec4.setText(sec4);
            nb_sec5.setText(sec5);
            nb_sec6.setText(sec6);
            nb_sec7.setText(sec7);
            nb_sec8.setText("");
            nb_sec9.setText("");
            nb_sec10.setText("");
            String nom1 = newCoupsParties.get(0);
            String nom2 = newCoupsParties.get(1);
            String nom3 = newCoupsParties.get(2);
            String nom4 = newCoupsParties.get(3);
            String nom5 = newCoupsParties.get(4);
            String nom6 = newCoupsParties.get(5);
            String nom7 = newCoupsParties.get(6);
            nb_coups1.setText(nom1);
            nb_coups2.setText(nom2);
            nb_coups3.setText(nom3);
            nb_coups4.setText(nom4);
            nb_coups5.setText(nom5);
            nb_coups6.setText(nom6);
            nb_coups7.setText(nom7);
            nb_coups8.setText("");
            nb_coups9.setText("");
            nb_coups10.setText("");
        }
        else if (newChronoParties.size()==8 && newCoupsParties.size()==8){
            String sec1 = newChronoParties.get(0);
            String sec2 = newChronoParties.get(1);
            String sec3 = newChronoParties.get(2);
            String sec4 = newChronoParties.get(3);
            String sec5 = newChronoParties.get(4);
            String sec6 = newChronoParties.get(5);
            String sec7 = newChronoParties.get(6);
            String sec8 = newChronoParties.get(7);
            nb_sec1.setText(sec1);
            nb_sec2.setText(sec2);
            nb_sec3.setText(sec3);
            nb_sec4.setText(sec4);
            nb_sec5.setText(sec5);
            nb_sec6.setText(sec6);
            nb_sec7.setText(sec7);
            nb_sec8.setText(sec8);
            nb_sec9.setText("");
            nb_sec10.setText("");
            String nom1 = newCoupsParties.get(0);
            String nom2 = newCoupsParties.get(1);
            String nom3 = newCoupsParties.get(2);
            String nom4 = newCoupsParties.get(3);
            String nom5 = newCoupsParties.get(4);
            String nom6 = newCoupsParties.get(5);
            String nom7 = newCoupsParties.get(6);
            String nom8 = newCoupsParties.get(7);
            nb_coups1.setText(nom1);
            nb_coups2.setText(nom2);
            nb_coups3.setText(nom3);
            nb_coups4.setText(nom4);
            nb_coups5.setText(nom5);
            nb_coups6.setText(nom6);
            nb_coups7.setText(nom7);
            nb_coups8.setText(nom8);
            nb_coups9.setText("");
            nb_coups10.setText("");
        }
        else if (newChronoParties.size()==9 && newCoupsParties.size()==9){
            String sec1 = newChronoParties.get(0);
            String sec2 = newChronoParties.get(1);
            String sec3 = newChronoParties.get(2);
            String sec4 = newChronoParties.get(3);
            String sec5 = newChronoParties.get(4);
            String sec6 = newChronoParties.get(5);
            String sec7 = newChronoParties.get(6);
            String sec8 = newChronoParties.get(7);
            String sec9 = newChronoParties.get(8);
            nb_sec1.setText(sec1);
            nb_sec2.setText(sec2);
            nb_sec3.setText(sec3);
            nb_sec4.setText(sec4);
            nb_sec5.setText(sec5);
            nb_sec6.setText(sec6);
            nb_sec7.setText(sec7);
            nb_sec8.setText(sec8);
            nb_sec9.setText(sec9);
            nb_sec10.setText("");
            String nom1 = newCoupsParties.get(0);
            String nom2 = newCoupsParties.get(1);
            String nom3 = newCoupsParties.get(2);
            String nom4 = newCoupsParties.get(3);
            String nom5 = newCoupsParties.get(4);
            String nom6 = newCoupsParties.get(5);
            String nom7 = newCoupsParties.get(6);
            String nom8 = newCoupsParties.get(7);
            String nom9 = newCoupsParties.get(8);
            nb_coups1.setText(nom1);
            nb_coups2.setText(nom2);
            nb_coups3.setText(nom3);
            nb_coups4.setText(nom4);
            nb_coups5.setText(nom5);
            nb_coups6.setText(nom6);
            nb_coups7.setText(nom7);
            nb_coups8.setText(nom8);
            nb_coups9.setText(nom9);
            nb_coups10.setText("");
        }
        else {
            String sec1 = newChronoParties.get(0);
            String sec2 = newChronoParties.get(1);
            String sec3 = newChronoParties.get(2);
            String sec4 = newChronoParties.get(3);
            String sec5 = newChronoParties.get(4);
            String sec6 = newChronoParties.get(5);
            String sec7 = newChronoParties.get(6);
            String sec8 = newChronoParties.get(7);
            String sec9 = newChronoParties.get(8);
            String sec10 = newChronoParties.get(9);
            nb_sec1.setText(sec1);
            nb_sec2.setText(sec2);
            nb_sec3.setText(sec3);
            nb_sec4.setText(sec4);
            nb_sec5.setText(sec5);
            nb_sec6.setText(sec6);
            nb_sec7.setText(sec7);
            nb_sec8.setText(sec8);
            nb_sec9.setText(sec9);
            nb_sec10.setText(sec10);
            String nom1 = newCoupsParties.get(0);
            String nom2 = newCoupsParties.get(1);
            String nom3 = newCoupsParties.get(2);
            String nom4 = newCoupsParties.get(3);
            String nom5 = newCoupsParties.get(4);
            String nom6 = newCoupsParties.get(5);
            String nom7 = newCoupsParties.get(6);
            String nom8 = newCoupsParties.get(7);
            String nom9 = newCoupsParties.get(8);
            String nom10 = newCoupsParties.get(9);
            nb_coups1.setText(nom1);
            nb_coups2.setText(nom2);
            nb_coups3.setText(nom3);
            nb_coups4.setText(nom4);
            nb_coups5.setText(nom5);
            nb_coups6.setText(nom6);
            nb_coups7.setText(nom7);
            nb_coups8.setText(nom8);
            nb_coups9.setText(nom9);
            nb_coups10.setText(nom10);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tableauxDesScores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nb_sec1 = new javax.swing.JLabel();
        nb_sec2 = new javax.swing.JLabel();
        nb_sec3 = new javax.swing.JLabel();
        nb_sec4 = new javax.swing.JLabel();
        nb_sec5 = new javax.swing.JLabel();
        nb_sec6 = new javax.swing.JLabel();
        nb_sec7 = new javax.swing.JLabel();
        nb_sec8 = new javax.swing.JLabel();
        nb_sec9 = new javax.swing.JLabel();
        nb_sec10 = new javax.swing.JLabel();
        nb_coups10 = new javax.swing.JLabel();
        nb_coups9 = new javax.swing.JLabel();
        nb_coups8 = new javax.swing.JLabel();
        nb_coups7 = new javax.swing.JLabel();
        nb_coups6 = new javax.swing.JLabel();
        nb_coups5 = new javax.swing.JLabel();
        nb_coups4 = new javax.swing.JLabel();
        nb_coups3 = new javax.swing.JLabel();
        nb_coups2 = new javax.swing.JLabel();
        nb_coups1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableauxDesScores.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tableauxDesScores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "         Nombre de coups", "                  Joueur"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableauxDesScores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 320, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Tableaux des meilleurs scores :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jTable1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "     Nombre de secondes", "                 Joueur"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 320, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Classement des plus efficaces");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Classement des plus rapides");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        nb_sec1.setText("s1");
        getContentPane().add(nb_sec1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        nb_sec2.setText("s2");
        getContentPane().add(nb_sec2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        nb_sec3.setText("s3");
        getContentPane().add(nb_sec3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        nb_sec4.setText("s4");
        getContentPane().add(nb_sec4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));

        nb_sec5.setText("s5");
        getContentPane().add(nb_sec5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));

        nb_sec6.setText("s6");
        getContentPane().add(nb_sec6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        nb_sec7.setText("s7");
        getContentPane().add(nb_sec7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));

        nb_sec8.setText("s8");
        getContentPane().add(nb_sec8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, -1, -1));

        nb_sec9.setText("s9");
        getContentPane().add(nb_sec9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, -1, -1));

        nb_sec10.setText("s10");
        getContentPane().add(nb_sec10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));

        nb_coups10.setText("nomJ10");
        getContentPane().add(nb_coups10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, -1, -1));

        nb_coups9.setText("nomJ9");
        getContentPane().add(nb_coups9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, -1, -1));

        nb_coups8.setText("nomJ8");
        getContentPane().add(nb_coups8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, -1, -1));

        nb_coups7.setText("nomJ7");
        getContentPane().add(nb_coups7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, -1, -1));

        nb_coups6.setText("nomJ6");
        getContentPane().add(nb_coups6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, -1, -1));

        nb_coups5.setText("nomJ5");
        getContentPane().add(nb_coups5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, -1, -1));

        nb_coups4.setText("nomJ4");
        getContentPane().add(nb_coups4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, -1, -1));

        nb_coups3.setText("nomJ3");
        getContentPane().add(nb_coups3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, -1, -1));

        nb_coups2.setText("nomJ2");
        getContentPane().add(nb_coups2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, -1, -1));

        nb_coups1.setText("nomJ1");
        getContentPane().add(nb_coups1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 320, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, 320, 20));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 320, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 320, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 320, 10));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 320, 10));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 320, 10));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 320, 10));

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 320, 10));

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 320, 10));

        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 320, 10));

        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 320, 10));

        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 320, 10));

        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 320, 10));

        jSeparator15.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 320, 20));

        jSeparator16.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 320, 20));

        jSeparator17.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 320, 20));

        jSeparator18.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 320, 20));

        jSeparator19.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 320, 20));

        jSeparator20.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 320, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Tableaux_scores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tableaux_scores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tableaux_scores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tableaux_scores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tableaux_scores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel nb_coups1;
    private javax.swing.JLabel nb_coups10;
    private javax.swing.JLabel nb_coups2;
    private javax.swing.JLabel nb_coups3;
    private javax.swing.JLabel nb_coups4;
    private javax.swing.JLabel nb_coups5;
    private javax.swing.JLabel nb_coups6;
    private javax.swing.JLabel nb_coups7;
    private javax.swing.JLabel nb_coups8;
    private javax.swing.JLabel nb_coups9;
    private javax.swing.JLabel nb_sec1;
    private javax.swing.JLabel nb_sec10;
    private javax.swing.JLabel nb_sec2;
    private javax.swing.JLabel nb_sec3;
    private javax.swing.JLabel nb_sec4;
    private javax.swing.JLabel nb_sec5;
    private javax.swing.JLabel nb_sec6;
    private javax.swing.JLabel nb_sec7;
    private javax.swing.JLabel nb_sec8;
    private javax.swing.JLabel nb_sec9;
    private javax.swing.JTable tableauxDesScores;
    // End of variables declaration//GEN-END:variables
}
