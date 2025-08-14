package co.unicauca.figures.domain;

/**
 *
 * @author brada
 */
public class Circle extends Figure{
    private double radius;

    public Circle(double prmRadius) {
        super(0, 0);
        this.radius = prmRadius;
    }
    
    public double getRadio() {
        return radius;
    }

    public void setRadio(double prmRadius) {
        this.radius = prmRadius;
    }

    
    @Override
    public double calculatePerimeter() {
        return Math.PI*radius*2; 
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }          
}
