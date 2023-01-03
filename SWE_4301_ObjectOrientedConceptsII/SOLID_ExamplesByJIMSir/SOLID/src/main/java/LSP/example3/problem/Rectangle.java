package LSP.example3.problem;

/**
 * Created by jubair.
 * Date: 8/9/22
 * Time: 3:14 PM
 */

public class Rectangle {
    protected int height;
    protected int width;

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    public int area(){
        return height * width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
