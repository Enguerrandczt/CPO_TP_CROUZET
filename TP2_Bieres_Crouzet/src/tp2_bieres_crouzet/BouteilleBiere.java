/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_crouzet;

/**
 *
 * @author engue
 */
public class BouteilleBiere {

    double degreAlcool;

    String Nom;

    String brasserie;

    boolean ouverte; 

 

public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {

Nom = unNom;

degreAlcool = unDegre;

brasserie = uneBrasserie;

ouverte = false;

}

 

public void lireEtiquette() {

 

System.out.println("Bouteille de " + Nom +" (" + degreAlcool +

" degres) \nBrasserie : " + brasserie ) ;

}

 

public void Décapsuler() {

 

if (ouverte == false) {

    ouverte = true;

    System.out.println("La bière est maintenant ouverte");

} else if (ouverte == true) {

    System.out.println("La bière est déjà ouverte");

}

 

}

 

@Override

public String toString() {

String chaine_a_retourner;

chaine_a_retourner = Nom + " (" + degreAlcool + " degrés) ouverte ? ";

if (ouverte == true )

    chaine_a_retourner += "oui" ;

else chaine_a_retourner += "non" ;

    return chaine_a_retourner ;

}

}
    
