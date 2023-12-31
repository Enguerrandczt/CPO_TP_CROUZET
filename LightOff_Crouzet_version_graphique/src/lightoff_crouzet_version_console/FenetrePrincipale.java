/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lightoff_crouzet_version_console;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;



/**
 *
 * @author engue
 */
public class FenetrePrincipale extends javax.swing.JFrame {

    GrilleDeJeu grille;
    int nbCoups;
    int nbCoupsMax;
    int i;
    int h =10;
   
    


    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipale() {

        initComponents();
        int nbLignes = 10;
        int nbColonnes = 10;
        Difficulte();
        

        
         
        this.grille = new GrilleDeJeu(nbLignes, nbColonnes);
        
        

        jTextArea1.setVisible(false);
        jButton2.setVisible(false);
        jButton1.setVisible(false);
        
        

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                CelluleGraphique bouton_cellule = new CelluleGraphique(grille.matriceCellules[i][j], 36, 36); // création d'un bouton
                PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille

            }
        }
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60,
                nbColonnes * 40, nbLignes * 40));
        this.pack();
        this.revalidate();

        PanneauBoutonsVerticaux.setLayout(new GridLayout(nbLignes, 1));
        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 1 * 40, nbLignes * 40));
        this.pack();
        this.revalidate();

        // création du panneau de boutons verticaux (pour les lignes)
        for (i = 0; i < nbLignes; i++) {
            JButton bouton_ligne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerLigneDeCellules(j);
                    repaint();
                    nbCoups++;
                    Fin();
                }
            };
            bouton_ligne.addActionListener(ecouteurClick);
            PanneauBoutonsVerticaux.add(bouton_ligne);

        }

        PanneauBoutonsHorizontaux.setLayout(new GridLayout(1, nbColonnes));
        getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, nbColonnes * 40, 1 * 40));
        this.pack();
        this.revalidate();

        // création du panneau de boutons verticaux (pour les lignes)
        for (i = 0; i < nbColonnes; i++) {
            JButton bouton_colonne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerColonneDeCellules(j);
                    repaint();
                    nbCoups++;
                            

                    
                    Fin();
                }
            };
            bouton_colonne.addActionListener(ecouteurClick);
            PanneauBoutonsHorizontaux.add(bouton_colonne);

        }

        getContentPane().add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10,1 * 40, 1 * 40));
                
                
        this.pack();
        this.revalidate();

        getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(120 + nbColonnes * 40, 10,
                1 * 40, 1 * 40));
        this.pack();
        this.revalidate();

    }
    

    public void Fin() {
    if (this.grille.cellulesToutesEteintes() == true) {
        jButton22.setEnabled(false);
        jButton21.setEnabled(false);
        PanneauBoutonsHorizontaux.setVisible(false);
        PanneauBoutonsVerticaux.setVisible(false);
        jTextArea1.setVisible(true);
        jButton2.setVisible(true);
        jButton1.setVisible(true);
    }

    // Ajout de la vérification pour arrêter le jeu
    if (nbCoups > nbCoupsMax) {
        jButton22.setEnabled(false);
        jButton21.setEnabled(false);
        PanneauBoutonsHorizontaux.setVisible(false);
        PanneauBoutonsVerticaux.setVisible(false);
        jTextArea1.setText("Perdu! trop de coups !\n\nTu veux rejouer?");
        jTextArea1.setVisible(true);
        jButton2.setVisible(true);
        jButton1.setVisible(true);
    }
}

    public final void Difficulte() {
    jButton3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Difficulté facile
            
           
            h = 10; 
            nbCoupsMax = 100;
            initialiserPartie();
            
            jButton4.setVisible(false);
        jButton3.setVisible(false);
        jButton5.setVisible(false);
        jTextArea2.setVisible(false);
        
            
        }
    });

    jButton4.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Difficulté moyenne
            h = 100;
            nbCoupsMax = 25;//
            initialiserPartie();
            jButton4.setVisible(false);
        jButton3.setVisible(false);
        jButton5.setVisible(false);
        jTextArea2.setVisible(false);
        }
    });

    jButton5.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Difficulté impossible
            h = 1500; 
            nbCoupsMax = 10;
            initialiserPartie();
            jButton4.setVisible(false);
        jButton3.setVisible(false);
        jButton5.setVisible(false);
        jTextArea2.setVisible(false);
        }
    });
}


    public void initialiserPartie() {
        int nbLignes = 10;
        int nbColonnes = 10;
        grille.eteindreToutesLesCellules();
        grille.melangerMatriceAleatoirement(h);
        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
        JLabel labelNbCoups = new javax.swing.JLabel("tu n'as que " + nbCoupsMax+" coups!");
getContentPane().add(labelNbCoups, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, -1, -1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        PanneauGrille = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        PanneauBoutonsVerticaux = new javax.swing.JPanel();
        PanneauBoutonsHorizontaux = new javax.swing.JPanel();
        FenetreVictoire = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(671, 500));
        setPreferredSize(new java.awt.Dimension(600, 440));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(0, 0, 242));
        PanneauGrille.setMaximumSize(new java.awt.Dimension(400, 600));
        PanneauGrille.setMinimumSize(new java.awt.Dimension(400, 600));
        PanneauGrille.setPreferredSize(new java.awt.Dimension(600, 400));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 430, 340));

        jButton21.setText("jButton21");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 20, -1));

        jButton22.setText("jButton22");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 40, -1));

        javax.swing.GroupLayout PanneauBoutonsVerticauxLayout = new javax.swing.GroupLayout(PanneauBoutonsVerticaux);
        PanneauBoutonsVerticaux.setLayout(PanneauBoutonsVerticauxLayout);
        PanneauBoutonsVerticauxLayout.setHorizontalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        PanneauBoutonsVerticauxLayout.setVerticalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        javax.swing.GroupLayout PanneauBoutonsHorizontauxLayout = new javax.swing.GroupLayout(PanneauBoutonsHorizontaux);
        PanneauBoutonsHorizontaux.setLayout(PanneauBoutonsHorizontauxLayout);
        PanneauBoutonsHorizontauxLayout.setHorizontalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );
        PanneauBoutonsHorizontauxLayout.setVerticalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, -30, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("trop simple pour toi !\n\nTu veux rejouer?");
        FenetreVictoire.setViewportView(jTextArea1);

        getContentPane().add(FenetreVictoire, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 200, 70));

        jButton1.setText("NON!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, -1, -1));

        jButton2.setText("OUI");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, -1, -1));

        jButton3.setText("Facile");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, -1, -1));

        jButton5.setText("impossible");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, -1, -1));

        jButton4.setText("Moyen");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, -1, -1));

        jScrollPane1.setEnabled(false);
        jScrollPane1.setHorizontalScrollBar(null);
        jScrollPane1.setInheritsPopupMenu(true);
        jScrollPane1.setOpaque(false);
        jScrollPane1.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(jTextArea2);
        jScrollPane1.setWheelScrollingEnabled(false);

        jTextArea2.setBackground(new java.awt.Color(255, 51, 153));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Quelle difficultée?");
        jTextArea2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jScrollPane1.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 130, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        this.grille.activerDiagonaleDescendante();// TODO add your handling code here:
        nbCoups++;
        
        Fin();
        repaint();// TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        this.grille.activerDiagonaleMontante();// TODO add your handling code here:
        nbCoups++;
        Fin();
        repaint();// TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new FenetrePrincipale().setVisible(true);
        }
    });
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane FenetreVictoire;
    private javax.swing.JPanel PanneauBoutonsHorizontaux;
    private javax.swing.JPanel PanneauBoutonsVerticaux;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables

}
