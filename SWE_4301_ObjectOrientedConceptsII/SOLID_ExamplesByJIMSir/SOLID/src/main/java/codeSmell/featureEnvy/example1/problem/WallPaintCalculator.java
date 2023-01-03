package codeSmell.featureEnvy.example1.problem;

/**
 * Created by jubair.
 * Date: 6/11/22
 * Time: 10:30 PM
 */

public class WallPaintCalculator {
    int costOfWallPainting(Wall wall, Paint paint){
        int area = wall.getWidth() * wall.getHeight();
        int litresPerSquareMeter = paint.efficiency();
        int litres = litresPerSquareMeter * area;
        return litres * paint.pricePerLitre();
    }
    // other code
}