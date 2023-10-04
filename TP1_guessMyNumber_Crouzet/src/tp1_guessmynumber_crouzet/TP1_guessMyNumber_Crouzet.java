/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_crouzet;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author engue
 */
public class TP1_guessMyNumber_Crouzet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       


        Scanner scanner = new Scanner(System.in);
        Random generateurAleat = new Random();

        System.out.println("Bienvenue dans Guess My Number !");
        System.out.print("Choisissez un niveau de difficulté (facile, normal, difficile) : ");
        String niveau = scanner.nextLine();
        int min = 0;
        int max = 100;
        int tentativesMax = 0;

        switch (niveau.toLowerCase()) {
            case "facile":
                tentativesMax = 15;
                break;
            case "normal":
                tentativesMax = 10;
                break;
            case "difficile":
                tentativesMax = 6;
                break;
            default:
                System.out.println("Niveau de difficulté non reconnu. Jeu terminé.");
                return;
        }
        if (operator == 1) {
            resultat = CelsiusVersKelvin(temperature);
        } else if (operator == 2) {
            resultat = FahrenheitVersCelsius(temperature);
        } else if (operator == 3) {
            resultat = CelsiusVersFahrenheit(temperature);
        }else if (operator == 4){
            resultat = KelvinVersCelsius(temperature);
        } else if (operator == 5){
            resultat = KelvinVersFahrenheit(temperature);
        }  else if (operator == 6){
            resultat = FahrenheitVersCelsius(temperature) + 273.15;
        }

        int nombreAleatoire = generateurAleat.nextInt(101);
        int tentatives = 0;

        System.out.println("Devinez le nombre entre 0 et 100 !");

        while (tentatives < tentativesMax) {
            System.out.print("Entrez un nombre : ");
            int nombreSaisi = scanner.nextInt();
            tentatives++;

            if (nombreSaisi < nombreAleatoire) {
                System.out.println("Trop petit !");
            } else if (nombreSaisi > nombreAleatoire) {
                System.out.println("Trop grand !");
            } else {
                System.out.println("Bravo, vous avez trouvé le nombre en " + tentatives + " tentatives !");
                return;
            }
        }

        System.out.println("Dommage, vous avez épuisé toutes vos tentatives. Le nombre était : " + nombreAleatoire);
    }
}
