/*
 * C
 */
package tp2_bieres_crouzet;

/**
 *
 * @author engue
 */
public class TP2_Bieres_Crouzet {
 

    /**

     * @param args the command line arguments

     */

    public static void main(String[] args) {

        // TODO code application logic here

   

    BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0 ,"Dubuisson") ;


    uneBiere.lireEtiquette();
    uneBiere.Décapsuler();
    System.out.println(uneBiere) ;

   

    BouteilleBiere deuxBiere = new BouteilleBiere("Leffe",6.6 ,"Abbaye de Leffe") ;
    deuxBiere.lireEtiquette();
    deuxBiere.Décapsuler();
    System.out.println(deuxBiere) ;

    

    BouteilleBiere troisBiere = new BouteilleBiere("Heineken",5.0 ,"VieuxTabac") ;


        troisBiere.lireEtiquette();
        troisBiere.Décapsuler();
        System.out.println(troisBiere) ;

       

    BouteilleBiere quatreBiere = new BouteilleBiere("Licorne",6.0 ,"troissixBeziers") ;

   

        quatreBiere.lireEtiquette();
        quatreBiere.Décapsuler();
        System.out.println(quatreBiere) ;

   

    BouteilleBiere cinqBiere = new BouteilleBiere("Rince cochon",6.0 ,"3brasseurs") ;

  
        cinqBiere.lireEtiquette();

        cinqBiere.Décapsuler();
        System.out.println(cinqBiere) ;

  

    }

     

}