import Shapes.Shape;
import Shapes.ShapeFactory;

public class FactoryPatternDemo {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        shape1.showArea();

        System.out.println();
        System.out.println();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        shape2.showArea();

        System.out.println();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
        shape3.showArea();
    }
}