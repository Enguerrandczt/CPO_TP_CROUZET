/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_crouzet;

/**
 *
 * @author engue
 */
public class Personne {

    public Personne(String Nom, String Prenom, Voiture[] liste_voitures, Personne Proprietaire) {
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.liste_voitures = liste_voitures;
        this.Proprietaire = Proprietaire;
    }
    

    

    
    
    String Nom;
    String Prenom;
    Voiture[] liste_voitures;
    Personne Proprietaire ;
    int nbVoitures ;
    Voiture [] liste_voitures ;

    @Override
    public String toString() {
        return "Personne{" + "Nom=" + Nom + ", Prenom=" + Prenom + ", liste_voitures=" + liste_voitures + '}';
    }

   
}
