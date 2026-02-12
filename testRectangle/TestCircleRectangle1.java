package testRectangle;
    public class TestCircleRectangle1 {
  public static void main(String[] args) {
    Circle1 circle = new Circle1(1);
    System.out.println("A circle " + circle.toString());
    System.out.println("The color is " + circle.getColor());
    System.out.println("The radius is " + circle.getRadius());
    System.out.println("The area is " + circle.getArea());
    System.out.println("The diameter is " + circle.getDiameter());
    
    ScaleneTriangle triangle = new ScaleneTriangle(3,4,5);
    System.out.println("\nA triangle " + triangle.toString());
    System.out.println("The color is " + triangle.getColor());
    System.out.println("The side1 is " + triangle.getSide1());
    System.out.println("The side2 is " + triangle.getSide2());
    System.out.println("The side3 is " + triangle.getSide3());
    System.out.println("The area is " + triangle.getArea());

  }
}