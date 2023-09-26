/*
 *CROUZET Enguerrand tp1 decouverte syntaxe de base 
 */
package tp1_crouzete;

import java.util.Scanner;

/**
 *
 * @author engue
 */
public class TP1_CrouzetE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ope;
        int oper;  
        Scanner sc = new Scanner(System.in);
        ope=sc.nextInt();
        oper=sc.nextInt();
        int somme=ope+oper;
        int produit = ope*oper;
        int difference = ope-oper;
        int quotient= ope/oper;
        int reste = ope%oper;
        System.out.println("somme" +somme+"diff"+difference+ "produit"+produit+"le quotient  "+quotient+" le reste  "+reste);
    }
    
}
