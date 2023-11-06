/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_crouzet_version_console;


public class CelluleLumineuse {
    private boolean etat; 

   

    /**
     *met la cellule de base en eteint
     */
    public CelluleLumineuse() {
        etat = false; 
    }

    // Méthode pour activer/inverser l'état de la cellule

    /**
     *ca permet d'activer la cellule
     */
    public void activerCellule() {
        etat = !etat; 
    }

    

    /**
     *Méthode pour éteindre la cellule
     */
    public void eteindreCellule() {
        etat = false; // Met la cellule dans l'état "éteinte"
    }

    /**
     *Méthode pour vérifier si la cellule est éteinte
     * @return  Renvoie true si la cellule est éteinte, false sinon
     */
    public boolean estEteint() {
        return !etat; 
    }

    

    /**
     *Méthode pour obtenir l'état actuel de la cellule
     * @return renvoie l'etat false ou true 
     */
    public boolean getEtat() {
        return etat;
    }

    @Override
    public String toString() {
        return etat ? "X" : "O";
    }
    
    
    
    
}
