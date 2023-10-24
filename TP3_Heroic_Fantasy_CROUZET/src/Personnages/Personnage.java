package Personnages;


import tp3_heroic_fantasy_crouzet.Armes.Arme;

import Arme.*
import java.util.ArrayList;


package Personnages;

public abstract class Personnage {
    private String nom;
    private int niveauDeVie;
    private ArrayList<Arme> inventaireArmes;
    private Arme armeEnMain;

    public Personnage(String nom, int niveauDeVie) {
        this.nom = nom;
        this.niveauDeVie = niveauDeVie;
        inventaireArmes = new ArrayList<>();
        armeEnMain = null;
    }

    public int getNiveauDeVie() {
        return niveauDeVie;
    }

    public String getNom() {
        return nom;
    }
   
   

    
    

    @Override
    public String toString() {
        return "Personnage{" +
                "nom='" + nom + '\'' +
                ", niveauDeVie=" + niveauDeVie +
                '}';
    }
}
