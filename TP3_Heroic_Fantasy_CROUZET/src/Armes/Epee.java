package Armes;



/*


/**
 *
 * @author engue
 */
public class Epee extends Arme {
    int finesse;
    
    public Epee(String nom, int niveau){
        super(nom,niveau);
    }
    
    public Epee( String nom, int niveau,int finesse) {
        super(nom, niveau);
                if (finesse <= 100) {
            this.finesse = finesse;
        } else {
            this.finesse = 100;
        }
    }

}
    

