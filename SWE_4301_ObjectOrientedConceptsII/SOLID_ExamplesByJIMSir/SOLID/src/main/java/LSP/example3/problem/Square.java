package LSP.example3.problem;

/**
 * Created by jubair.
 * Date: 8/9/22
 * Time: 3:15 PM
 */

public class Square extends Rectangle{
    public Square(int height) {
        super(height, height);
    }

    public void setHeight(int height){
        super.height = height;
        super.width = height;
    }

    public void setWidth(int width){
        super.height = width;
        super.width = width;
    }

    public int area(){
        return height * height;
    }
}
