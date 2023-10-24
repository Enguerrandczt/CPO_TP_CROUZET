//ick edit this template
//*/
package tp3_heroic_fantasy_crouzet;

import Personnages.Guerrier;
import Personnages.Magicien;
import Personnages.Personnage;
import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author engue
 */
public class TP3_Heroic_Fantasy_CROUZET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);
        Baton chene = new Baton("chêne", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);

        ArrayList<Arme> listeArmes = new ArrayList<>();
        listeArmes.add(excalibur);
        listeArmes.add(durandal);
        listeArmes.add(chene);
        listeArmes.add(charme);
        int taille_1 = listeArmes.size();
        for (int i = 0; i < taille_1; i++) {
            Arme valeur_1 = listeArmes.get(i);
            System.out.print(valeur_1);
        // Créer 2 magiciens
        Magicien gandalf = new Magicien("Gandalf", 65, true);
        Magicien garcimore = new Magicien("Garcimore", 44, false);

        // Créer 2 guerriers
        Guerrier conan = new Guerrier("Conan", 78, false);
        Guerrier lannister = new Guerrier("Lannister", 45, true);

        // Créer un tableau dynamique pour stocker les personnages
        Personnage[] personnages = {gandalf, garcimore, conan, lannister};

        // Afficher les caractéristiques de chaque personnage
        for (Personnage personnage : personnages) {
            System.out.println(personnage);

        }
    }
    }
}
