package co.unicauca.figures.domain;

/**
 *
 * @author Alexp
 */
public class Square extends Figure{

    public Square(double prmSide) {
        super(prmSide, prmSide);
    }
    
    @Override    
    public double calculatePerimeter()
    {
        return 4*getX1();
    }
    
    @Override 
    public double calculateArea()
    {
        return getX1()*getY1();
    }    
}
