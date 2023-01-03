package codeSmell.featureEnvy.example1.solution;

/**
 * Created by jubair.
 * Date: 6/11/22
 * Time: 10:27 PM
 */

public class Wall {
    int height;
    int width;

    public Wall(int height, int width){
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int area(){
        return height * width;
    }
}
