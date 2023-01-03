package codeSmell.featureEnvy.example1.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jubair.
 * Date: 6/11/22
 * Time: 10:30 PM
 */

class WallPaintCalculatorTest {
    @Test
    public void wallPaintTest(){
        WallPaintCalculator wallPaintCalculator = new WallPaintCalculator();
        int cost = wallPaintCalculator.costOfWallPainting(new Wall(2, 3), new Paint(5, 20));
        assertEquals(600, cost);
    }

}