package LSP.example3.solution;

/**
 * Created by jubair.
 * Date: 8/9/22
 * Time: 3:17 PM
 */

public class Square implements IShape{
    int height;

    @Override
    public int area() {
        return height * height;
    }
}
