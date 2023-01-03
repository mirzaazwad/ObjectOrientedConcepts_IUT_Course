import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class ShapeTest {
    @Test
    public void TestCircle(){
        assertTrue(new Circle() instanceof Shape);
    }

    @Test
    public void TestSquare(){
        assertTrue(new Square() instanceof Shape);
    }

    @Test
    public void TestBadCode(){
        Shapes shape=new Shapes("circle");
        assertEquals(shape.DrawShape(),"Drawing circle");
    }


    @Test
    public void TestMultipleShapes(){
        shapeList shapes=new shapeList();
        shapes.addShape(new Circle(),"Drawing circle");
        shapes.addShape(new Circle(),"Drawing circle");
        shapes.addShape(new Square(),"Drawing square");
        shapes.addShape(new Circle(),"Drawing circle");
        assertTrue(shapes.TestOutputs());
    }


    @Test
    public void TestRectangle(){
        assertTrue(new Rectangle() instanceof Shape);
    }

    @Test
    public void TestCircleOutput(){
        assertEquals(new Circle().DrawShape(),"Drawing circle");
    }

    @Test
    public void TestSquareOutput(){
        assertEquals(new Square().DrawShape(),"Drawing square");
    }

    @Test
    public void TestRectangleOutput(){
        assertEquals(new Rectangle().DrawShape(),"Drawing rectangle");
    }


    @Test
    public void TestShapesAfterAddition(){
        shapeList shapes=new shapeList();
        shapes.addShape(new Circle(),"Drawing circle");
        shapes.addShape(new Rectangle(),"Drawing rectangle");
        shapes.addShape(new Square(),"Drawing square");
        shapes.addShape(new Circle(),"Drawing circle");
        assertTrue(shapes.TestOutputs());
    }

    @Test
    public void TestListShapes(){
        ArrayList<Shape>shapes=new ArrayList<Shape>();
        shapes.add(new Circle());
        shapes.add(new Square());
        shapes.add(new Rectangle());
        for(int i=0;i<shapes.size();i++){
            assertTrue(shapes.get(i) instanceof Shape);
        }
    }

    @Test
    public void TestingAllShapes(){
        shapeList shapes=new shapeList();
        shapes.addShape(new Circle());
        shapes.addShape(new Square());
        shapes.addShape(new Rectangle());
        ArrayList<Shape> allShapes=shapes.getShapeList();
        for(Shape shape:allShapes){
            shape.DrawShape();
            assertTrue(shape instanceof Shape);
        }

    }

    @Test
    public void TestingAllShapes2(){
        shapeList shapes=new shapeList();
        ArrayList<String>expectedOutputs=new ArrayList<String>();
        shapes.addShape(new Circle());
        expectedOutputs.add("Drawing circle");
        shapes.addShape(new Square());
        expectedOutputs.add("Drawing square");
        shapes.addShape(new Rectangle());
        expectedOutputs.add("Drawing rectangle");
        ArrayList<Shape> allShapes=shapes.getShapeList();
        for(int i=0;i<allShapes.size();i++){
            assertTrue(allShapes.get(i).DrawShape().equals(expectedOutputs.get(i)));
        }

    }





}
