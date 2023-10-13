/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_crouzet;

/**
 *
 * @author engue
 */
public class Voiture {

    
    public Voiture(String Marque, String Modele, double PuissanceCV, String proprietaire) {
        this.Marque = Marque;
        this.Modele = Modele;
        this.PuissanceCV = PuissanceCV;
        this.proprietaire = proprietaire;
    }
    
    String Marque;
    String Modele;
    double PuissanceCV;
    String  proprietaire="NULL";
    

    @Override
    public String toString() {
        return "Voiture{" + "Marque=" + Marque + ", Modele=" + Modele + ", PuissanceCV=" + PuissanceCV + ", proprietaire=" + proprietaire + '}';
    }
    

    
    

    
    
}
