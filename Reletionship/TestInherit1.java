package Reletionship;
public class TestInherit1 {
    public static void main(String[] args) {
        Employee e1 = new Employee("John");
        System.out.println(e1.toString());
        Manager m1 = new Manager("Mary",50000.0,"IT");
        System.out.println(m1.toString());
        System.out.println(m1.getName());
    }
}