/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Personnages.*
package Armes;

/**
 *
 * @author engue
 */
public abstract class Arme {
   
    String nom;
    int niveau;

    public Arme(String nom, int niveau) {
        this.nom = nom;
        if (niveau <= 100) {
            this.niveau = niveau;
        } else{
            this.niveau = 100;
    }
       

   
    
    }

    public int gen_niveau() {
        return niveau;
    }


    public String nom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + ", niveau=" + niveau + '}';
    }

   
}

    

    