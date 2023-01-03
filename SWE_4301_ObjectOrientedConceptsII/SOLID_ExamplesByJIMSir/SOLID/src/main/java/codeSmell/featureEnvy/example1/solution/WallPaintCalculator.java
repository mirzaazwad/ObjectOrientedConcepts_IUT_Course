package codeSmell.featureEnvy.example1.solution;

/**
 * Created by jubair.
 * Date: 6/11/22
 * Time: 10:30 PM
 */

public class WallPaintCalculator {
    int costOfWallPainting(Wall wall, Paint paint){
        return wall.area() * paint.pricePerSquareMeter();
    }
    // other code
}