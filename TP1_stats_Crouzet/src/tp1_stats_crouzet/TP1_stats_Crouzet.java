/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_crouzet;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author engue
 */
public class TP1_stats_Crouzet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        
        int[] distributionDes = new int[6];

        
        System.out.print("Entrez le nombre de lancers de dé: ");
        int m = scanner.nextInt();

        
        for (int i = 0; i < m; i++) {
            int resultatLancer = random.nextInt(6); 
            distributionDes[resultatLancer]++;
        }

     
        System.out.println("résultats en pourcentage :");
        for (int i = 0; i< 6; i++) {
            double pourcentage = (double) distributionDes[i] / m * 100;
            System.out.println("Face " + (i + 1) + ": " + pourcentage + "%");
        }
    }
}