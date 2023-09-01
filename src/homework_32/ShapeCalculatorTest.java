package homework_32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeCalculatorTest {
    private ShapeCalculator shapeCalculator=new ShapeCalculator();
    @Test
    private   void oneShape_test(){
        Shape[] shapes={new Rectangle(5,10)};
        assertEquals(50,shapeCalculator.totalSquare(shapes));
    }
    @Test
    private   void twoShape_test(){
        Shape[] shapes={new Rectangle(5,10),new Circle(10)};
        assertEquals(314,shapeCalculator.totalSquare(shapes));
    }

}