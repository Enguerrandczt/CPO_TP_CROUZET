/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_crouzet;

/**
 *
 * @author engue
 */
public class TP2_manip_Crouzet {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500) ;
        
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ;
        System.out.println("nb de calories de Assiette 2 : " +
        assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +
        assiette3.nbCalories) ;
        Tartiflette attente =assiette1;
        assiette1 = assiette2;
        assiette2 = attente;
        System.out.println("nb de calories de Assiette 2 : " +
        assiette1.nbCalories) ;
       
        Moussaka assiettes[] = new Moussaka[10] ;
        for (int i=0 ; i<assiettes.length; i++){
        assiettes[i]= new Moussaka(i);
        System.out.println(assiettes[i]);
        }
    }
}

 
            
        
        



