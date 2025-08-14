package co.unicauca.figures.domain;

/**
 *
 * @author Alexp
 */
public class Triangle extends Figure{
    
    public Triangle(double prmBase, double prmHeight){
        super(prmBase,prmHeight);
    }
    public double calculatePerimeter()
    {
        return Math.sqrt((getX1()*getX1()) + (getY1()*getY1())) + getX1() + getY1();
    }
    public double calculateArea()
    {
        return (getX1()*getY1())/2;
    }  
}
