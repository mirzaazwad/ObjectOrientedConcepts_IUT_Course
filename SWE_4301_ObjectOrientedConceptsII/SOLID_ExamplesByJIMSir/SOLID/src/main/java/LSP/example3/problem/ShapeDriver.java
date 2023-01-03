package LSP.example3.problem;

/**
 * Created by jubair.
 * Date: 8/9/22
 * Time: 3:22 PM
 */

public class ShapeDriver {
    public void changeWidth(Rectangle rectangle, int width){
        rectangle.setWidth(width);  // if square object is sent it will break
    }

    public static void main(String[] args) {
        ShapeDriver shapeDriver = new ShapeDriver();
        Rectangle rectangle = new Rectangle(5, 2);
        System.out.println(rectangle.getHeight() + " " + rectangle.getWidth());
        shapeDriver.changeWidth(rectangle, 3);
        System.out.println(rectangle.getHeight() + " " + rectangle.getWidth());

        Square square = new Square(5);
        System.out.println(square.getHeight() + " " + square.getWidth());
        shapeDriver.changeWidth(square, 3);
        System.out.println(square.getHeight() + " " + square.getWidth());
    }
}
