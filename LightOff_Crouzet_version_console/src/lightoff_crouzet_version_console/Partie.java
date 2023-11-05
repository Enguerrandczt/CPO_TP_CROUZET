/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_crouzet_version_console;
import java.util.Scanner;
/**
 *
 * @author engue
 */
public class Partie {
    private GrilleDeJeu grille;
    private int nbCoups;
    private int coupsMax = 0;
    private int lvl = 0;
    private int taille = 0;
    private int melange = 10;

    public Partie() {
        choisirTailleGrille();
        choisirNiveauDifficulte();
        grille = new GrilleDeJeu(taille, taille);
        nbCoups = 0;
    }

    public void choisirTailleGrille() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choisissez la taille de la grille : ");
        taille = scanner.nextInt();
    }

    public void choisirNiveauDifficulte() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choisissez le niveau de difficulté (1 pour facile, 2 pour moyen, 3 pour difficile) : ");
        lvl = scanner.nextInt();

        switch (lvl) {
            case 1:
                coupsMax = 20;
                melange = 10;
                break;
            case 2:
                coupsMax =  15;
                melange =50;
                break;
            case 3:
                coupsMax =  10;
                melange = 100;
                break;
            default:
                coupsMax = 200;
        }
    }
    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(melange); 
    }

    public void lancerPartie() {
        System.out.print("choisissez un niveau de difficulté");
        initialiserPartie();
        Scanner scanner= new Scanner(System.in);

        while (!grille.cellulesToutesEteintes()) {
            System.out.print("choisissez un niveau de difficulté");
            
            System.out.println("Jeu:");
            System.out.println(grille);

            System.out.println("Entrez un coup (l pour ligne c pour colonne et d pour diag;  ");
            String coup = scanner.nextLine();
            System.out.print("quel numéro de ligne ou colonne, si diagonale alors 1 montante et 2 déscendante; ");
            int nb = scanner.nextInt();
            nb = nb-1;
            scanner.nextLine(); // normalement résout un probleme 

           
        if (coup.equals("l")) {
            grille.activerLigneDeCellules(nb); 
        } else if (coup.equals("c")) {
            grille.activerColonneDeCellules(nb); 
        } else if (coup.equals("d")) {
            if (nb == 0) {
                grille.activerDiagonaleMontante(); 
            } else if (nb== 1) {
                grille.activerDiagonaleDescendante(); 
            } else {
                System.out.println("Coup invalide"); // marche pas non plus
            }

        } else {
            System.out.println("Coup invalide"); // marche pas 
        }


            nbCoups++;
            
            System.out.println("Nb coups: " + nbCoups);
        }

        System.out.println("And the WINNER IS LASALLE!! coups : " + nbCoups);
        
    }
}