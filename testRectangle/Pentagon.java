package testRectangle;
public class Pentagon extends Geo{
    private double perimeter;
    private double apothem;
    private static int count;

    public Pentagon (){
        ++count;
    }
    public Pentagon (double perimeter, double apothem){
        this.perimeter = perimeter;
        this.apothem = apothem;
        ++count;
    }
    public Pentagon(double perimeter, String color, boolean filled) {
    this.perimeter = perimeter;
    setColor(color);
    setFilled(filled);
    count++;
    }
    public double getApothem() {
    return this.apothem;
    }
    /** Set a new apothem */
    public void setApothem(double apothem) {
        this.apothem = apothem;
    }
    public double getPerimeter() {
    return this.perimeter;
    }
    /** Set a new perimeter */
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
      /** Return area */
    public double getArea() {
        return (perimeter*apothem)/2;
    }
    public int getCount(){
        return count;
    }
}