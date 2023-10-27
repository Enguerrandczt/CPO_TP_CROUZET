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

    public Partie() {
        grille = new GrilleDeJeu(5, 5); 
        nbCoups = 0; 
    }

    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(10); 
    }

    public void lancerPartie() {
        initialiserPartie();
        Scanner scanner= new Scanner(System.in);

        while (!grille.cellulesToutesEteintes()) {
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