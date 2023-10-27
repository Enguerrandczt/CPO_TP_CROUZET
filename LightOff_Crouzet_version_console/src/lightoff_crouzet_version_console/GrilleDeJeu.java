/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_crouzet_version_console;

import java.util.Random;

/**
 *
 * @author engue
 */
public class GrilleDeJeu {
    private CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;
    private Random rand = new Random();

    // Constructeur de la classe
    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
        nbLignes= p_nbLignes;
        nbColonnes= p_nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

        // Initialisation de chaque cellule de la matrice
        for (int i=0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }


    /**
     *éteindre toutes les cellules
     */
    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }

  
    /**
     *activer une ligne, une colonne ou une diagonale aléatoirement
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        int choix = rand.nextInt(3);

        switch (choix) {
            case 0:
                int ligneAleatoire = rand.nextInt(nbLignes);
                activerLigneDeCellules(ligneAleatoire);
                break;
            case 1:
                int colonneAleatoire = rand.nextInt(nbColonnes);
                activerColonneDeCellules(colonneAleatoire);
                break;
            case 2:
                if (rand.nextBoolean()) {
                    activerDiagonaleDescendante();
                } else {
                    activerDiagonaleMontante();
                }
                break;
        }
    }

    // Méthode pour mélanger la matrice aléatoirement

    /**
     *mélanger la matrice aléatoirement en prenant activerLigneColonneOuDiagonaleAleatoire()
     * @param nbTours
     */
    public void melangerMatriceAleatoirement(int nbTours) {
        eteindreToutesLesCellules();

        for (int tour = 0; tour < nbTours; tour++) {
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }



    /**
     *Méthode pour activer une ligne spécifique
     * @param idLigne
     */
    public void activerLigneDeCellules(int idLigne) {
        for (int i = 0; i < nbColonnes; i++) {
            matriceCellules[idLigne][i].activerCellule();
        }
    }

   

    /**
     *activer une colonne spécifique
     * @param idColonne
     */
    public void activerColonneDeCellules(int idColonne) {
        for (int j= 0; j< nbLignes; j++) {
            matriceCellules[j][idColonne].activerCellule();
        }
    }



    /**
     *activer la diagonale descendante
     */
    public void activerDiagonaleDescendante() {
        int min = Math.min(nbLignes, nbColonnes);
        for (int i= 0; i<min; i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    
    /**
     * activer la diagonale montante
     */
    public void activerDiagonaleMontante() {
        int min = Math.min(nbLignes, nbColonnes);
        for (int i= 0; i < min; i++) {
            matriceCellules[i][nbColonnes -1 -i].activerCellule();
        }
    }

   

    /**
     *vérifier si toutes les cellules sont éteintes 
     * @return un boolean vrai si
     */
    public boolean cellulesToutesEteintes() {
        for (int i=0; i< nbLignes; i++) {
            for (int j= 0; j< nbColonnes; j++) {
                if (!matriceCellules[i][j].estEteint()) {
                    return false;
                }
            }
        }
        return true;
    }

    
    @Override
    public String toString() {
    StringBuilder grilleString = new StringBuilder();

    // Afficher les numéros de colonne
    grilleString.append("   ");
    for (int j=0; j<nbColonnes;j++) {
        grilleString.append(" ").append(j+1).append(" |");
    }
    grilleString.append("\n");

    for (int i=0; i<nbLignes;i++) {
        grilleString.append(i+1).append(" |");
        for (int j=0; j<nbColonnes; j++) {
            grilleString.append(" ").append(matriceCellules[i][j]).append(" |");
        }
        grilleString.append("\n");
    }

    return grilleString.toString();
}

    
}
