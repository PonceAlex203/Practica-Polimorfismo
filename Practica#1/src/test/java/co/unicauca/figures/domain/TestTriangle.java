package co.unicauca.figures.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Alexp
 */
public class TestTriangle {
    private Triangle testTriangle;
    private double testExpResult, testResult;
    
    public TestTriangle(){
        
    }
    
    @Test
    public void testPerimeter(){
        System.out.println("calculate Perimeter");
        testTriangle = new Triangle(2, 5);
        testExpResult = (Math.sqrt((2*2) + (5*5)) + 2 + 5);
        testResult = testTriangle.calculatePerimeter();
        assertEquals(testExpResult, testResult);
    }
    
    @Test
    public void testArea(){
        System.out.println("calculate Area");
        testTriangle = new Triangle(2,5);
        testExpResult = (2*5)/2;
        testResult = testTriangle.calculateArea();
        assertEquals(testExpResult, testResult);
    }
}
