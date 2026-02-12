package testRectangle;

public class Hexagon extends Geo {
    private double a;

    public Hexagon() { }
    public Hexagon (double a){
        this.a = a;
    }
    public Hexagon(double a, String color, boolean filled) {
    this.a = a;
    setColor(color);
    setFilled(filled);
    }
    public double getArea() {
        return ((3 * Math.sqrt(3) * (this.a * this.a)) / 2);
    }

    public double getA() {
    return this.a;
    }
    /** Set a new perimeter */
    public void setA(double a) {
        this.a = a;
    }
}
