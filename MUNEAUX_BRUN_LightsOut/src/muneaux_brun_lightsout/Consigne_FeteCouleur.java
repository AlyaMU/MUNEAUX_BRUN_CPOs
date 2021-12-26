/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muneaux_brun_lightsout;

/**
 *
 * @author Mathilde
 */
public class Consigne_FeteCouleur extends javax.swing.JFrame {

    /**
     * Creates new form Consigne_Difficile
     */
    public Consigne_FeteCouleur() {
        initComponents();
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
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("\t\t\t\t                  Bonjour à toi cher joueur !\n\nVoici les règles du mode de jeu Fête Colorée\n\nBut du jeu :\n\n            - La grille de jeu contient des cases allumées et éteintes.\n            - Les lumières allumées sont de 2 couleurs différentes : rouge et jaune.\n            - Vous devez éteindre toutes les lumières le plus rapidement possible.\n\nFonctionnement du jeu :\n           \n\t- Lorsque vous appuyez sur une case :\n\t               - Elle change d'état : de éteinte vers allumée ou d'allumée vers éteinte\n\t               - Ses cases adjacentes changent d'état également : celles au dessus, en dessous, à droite et à gauche\n\t               - Si les cases adjacentes sont d'une couleur différente, elle ne change pas d'état\n\t               - Si vous appuyé sur une case éteinte, elle deviendra par défaut rouge.\n\t- La partie se termine lorsque toutes les lumières sont éteintes\n\nFonctionnement des bonus :\n           \n\t- Vous obtenez des bonus aléatoirement durant la partie en appuyant sur certaines cases\n\t- Ces bonus sont au nombre de 5 par partie\n\t- Ces bonus permettent d'éteindre une ligne ou une colonne\n\t- Pour utiliser ces bonus, il suffit d'appuyer sur le bouton correspondant à la ligne ou à la colonne souhaitée\n\nConsignes supplémentaires : Comment lancer la partie\n\n\t- Appuyez sur le bouton correspondant au mode de jeu souhaité\n\t- Une fenêtre de consigne s'affiche, fermez-la lorsque vous l'avez lue\n\t- Entrer votre nom à l'endroit prévu à cet effet (encare blanc à droite de \"Nom du joueur\")\n\t- Appuyez sur le bouton \"démarrer la partie\" APRES avoir entré votre nom (sans cela, le jeu risque de ne pas se souvenir de vous :( )\n\n\t\t\t\t\t\n\t\t\t\t\t      Bonne Partie !");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 992, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

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
            java.util.logging.Logger.getLogger(Consigne_FeteCouleur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consigne_FeteCouleur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consigne_FeteCouleur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consigne_FeteCouleur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consigne_FeteCouleur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
