/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author engue
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int operator;
        int operande1;
        int operande2;
        int resultat =0 ;
    //nb=5;
        Scanner sc = new Scanner(System.in);
        
        // TODO code application logic here
          

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) subtract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        System.out.println("quel operateur?");
        
        operator=sc.nextInt();
        if (operator >5) {
            System.out.println("pas possible");
            System.exit(0);
            
        }
        System.out.print("premier nombre ");
        operande1=sc.nextInt();
        System.out.print("deuxieme nombre ");
        operande2=sc.nextInt();
        if (operator == 1) {
        resultat = operande1 + operande2;
    } else if (operator == 2) {
        resultat = operande1 - operande2;
    } else if (operator == 3) {
        resultat = operande1 * operande2;
    } else if (operator == 4) {
        if (operande2 != 0) { // Vérifiez que le dénominateur n'est pas zéro
            resultat = operande1 / operande2;
        } else {
            System.out.println("Division par zéro n'est pas autorisée.");
        }
    } else if (operator == 5) {
        if (operande2 != 0) { // Vérifiez que le dénominateur n'est pas zéro
            resultat = operande1 % operande2;
        } else {
            System.out.println("Modulo avec dénominateur zéro n'est pas autorisé.");
        }
    }
    System.out.print("le resultat est :" +resultat);
        
        
        scanner.close();
    }
}


