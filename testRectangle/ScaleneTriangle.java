package testRectangle;

public class ScaleneTriangle extends Geo {
    private double side1;
    private double side2;
    private double side3;

    public ScaleneTriangle() {
    }

    public ScaleneTriangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public ScaleneTriangle(double side1, double side2, double side3, String color, boolean filled) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setColor(color);
        setFilled(filled);
    }

    /** Return side1 */
    public double getSide1() {
        return side1;
    }

    /** Set a new side1 */
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    /** Return side2 */
    public double getSide2() {
        return side2;
    }

    /** Set a new side2 */
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    /** Return side3 */
    public double getSide3() {
        return side3;
    }

    /** Set a new side3 */
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    /** Return area */
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /** Return perimeter */
    public double getA() {
        return side1 + side2 + side3;
    }
    
}
