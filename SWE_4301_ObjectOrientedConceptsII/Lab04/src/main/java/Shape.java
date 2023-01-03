import java.util.ArrayList;

abstract class Shape{
    public String shape;
    public String DrawShape(){
        return "Drawing "+shape;
    }
}

class Shapes{//Doesn't follow OCP the rest follows OCP
    public String shape;
    public Shapes(String shape){
        this.shape=shape;
    }
    public String DrawShape(){
        return "Drawing "+shape;
    }

}
class Circle extends Shape{
    public Circle() {
        this.shape = "circle";
    }
}

class Square extends Shape{
    public Square() {
        this.shape = "square";
    }
}

class Rectangle extends Shape{
    public Rectangle(){
        this.shape="rectangle";
    }
}

class shapeList{
    public ArrayList<Shape>shapeList;
    public ArrayList<String>expectedOutput;
    public shapeList(){
        shapeList=new ArrayList<Shape>();
        expectedOutput=new ArrayList<String>();
    }

    public void addShape(Shape shape){
        shapeList.add(shape);
    }
    public void addShape(Shape shape,String expectedString){
        shapeList.add(shape);
        expectedOutput.add(expectedString);
    }

    public boolean TestOutputs(){
        for(int i=0;i<shapeList.size();i++){
            Shape value=shapeList.get(i);
            if(!value.DrawShape().equals(expectedOutput.get(i))) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Shape> getShapeList(){
        return shapeList;
    }
}
