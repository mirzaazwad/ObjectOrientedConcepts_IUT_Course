package codeSmell.featureEnvy.example1.problem;

/**
 * Created by jubair.
 * Date: 6/11/22
 * Time: 10:27 PM
 */

public class Paint {
    int efficiency;
    int pricePerLitre;

    public Paint(int efficiency, int pricePerLitre){
        this.efficiency = efficiency;
        this.pricePerLitre = pricePerLitre;
    }

    int efficiency(){
        return efficiency;
    }

    int pricePerLitre(){
        return pricePerLitre;
    }
}
