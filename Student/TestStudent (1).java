package test;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.printStudent();
        System.out.println(s1.getSID());
        s1.setSID("6812225003");
        System.out.println(s1.getSID());
        Student s2 = new Student("6812220050");
        s2.printStudent();
        s2.printStudent("Hello");
        Student s3 = new Student("68122250010", "Liza");
        s3.printStudent("From s3");
    }
}