/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_crouzet;

import java.util.Scanner;

/**
 *
 * @author engue
 */
public class TP1_convertisseur_CROUZET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir une température : ");
        double temperature = scanner.nextDouble();

        System.out.println("1) CelsiusVersKelvin");
        System.out.println("2) FahrenheitVersCelsius");
        System.out.println("3) CelsiusVersFahrenheit");
        System.out.println("4) KelvinVersFahr");
        System.out.println("5) KelvinVersFarenheit");
        System.out.println("6) FarenheitVersKelvin(");


        System.out.print("Saisissez la conversion que vous souhaitez effectuer : ");
        int operator = scanner.nextInt();
        double resultat = 0;

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
                  
 
        System.out.println("Le résultat de la conversion est : " + resultat);
    }

    public static double CelsiusVersKelvin(double temperature) {
        return temperature + 273.15;
    }

    public static double FahrenheitVersCelsius(double temperature) {
        return (temperature - 32) * 5/9;
    }

    public static double CelsiusVersFahrenheit(double temperature) {
        return (temperature * 9/5) + 32;
    }
    public static double KelvinVersCelsius(double temperature) {
        return temperature -273.15;
    }
    public static double KelvinVersFahrenheit(double temperature) {
        return (temperature - 273.15) * 9/5 + 32;
    }

    
    
}




