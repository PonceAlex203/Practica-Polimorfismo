package co.unicauca.figures.domain;

/**
 *
 * @author Alexp
 */
public abstract class Figure implements iFigure{
    private double x1;
    private double y1;
    
    public Figure(double prmX1, double prmY1){
        this.x1 = prmX1;
        this.y1 = prmY1;
    }
    public double getX1() {
        return x1;
    }

    public void setX1(double prmX1) {
        this.x1 = prmX1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double prmY1) {
        this.y1 = prmY1;
    }
}
