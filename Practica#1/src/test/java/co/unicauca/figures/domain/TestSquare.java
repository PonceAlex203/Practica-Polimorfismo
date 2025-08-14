package co.unicauca.figures.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Alexp
 */
public class TestSquare {
    
    private Square testSquare;
    private double testExpResult, testResult;
    
    public TestSquare(){
        
    }
    @Test
    public void testPerimeter(){
        System.out.println("calculate Perimeter");
        testSquare = new Square(5);
        testExpResult = 5*4;
        testResult = testSquare.calculatePerimeter();
        assertEquals(testExpResult,testResult );
    }
    
    @Test
    public void testArea(){
        System.out.println("calculate Area");
        testSquare = new Square(5);
        testExpResult = 5*5;
        testResult = testSquare.calculateArea();
        assertEquals(testExpResult,testResult);
    }
}
