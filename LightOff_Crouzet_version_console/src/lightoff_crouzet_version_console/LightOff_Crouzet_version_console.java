/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_crouzet_version_console;

/**
 *
 * @author engue
 */
public class LightOff_Crouzet_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CelluleLumineuse cellule1 = new CelluleLumineuse();
        System.out.print(cellule1);
        CelluleLumineuse cellule2 = new CelluleLumineuse();
        System.out.print(cellule2);
        
        cellule1.activerCellule();
        System.out.println(cellule1);
        
       ///////////////////////////////////////////////////////////////////////////////////////////////
       
        GrilleDeJeu grille = new GrilleDeJeu(5, 5);

        // Affichage de l'état initial de la grille
        System.out.println("etat initial de la grille :");
        System.out.println(grille);

        // Méthode pour mélanger la grille de manière aléatoire
        grille.melangerMatriceAleatoirement(10000);

        // Affichage de la grille mélangée
        System.out.println("etat de la grille mélangée :");
        System.out.println(grille);

        // Méthode pour éteindre toutes les cellules de la grille
        grille.eteindreToutesLesCellules();

        // Affichage de la grille après avoir éteint toutes les cellules
        System.out.println("etat de la grille après extinction :");
        System.out.println(grille);

        // Activer une ligne, une colonne ou une diagonale aléatoirement
        grille.activerLigneColonneOuDiagonaleAleatoire();

 
        System.out.println("etat de la grille après activation aléatoire :");
        System.out.println(grille);

  
        if (grille.cellulesToutesEteintes()) {
            System.out.println("Toutes les cellules sont éteintes.");
        } else {
            System.out.println("Il reste des cellules allumées.");
        }
    }

    }
             
                
    
    

