package WorkArrey;

public class Student {
    private String studentId;
    private String Name;
    private String Major;
    private double Gpa;
public Student (String studentId, String name, String major, double gpa){
        this.studentId = studentId;
        this.Name = name;
        this.Major = major;
        this.Gpa = gpa;
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getName() {

        return Name;
    }
    public void setName(String name) {
        this.Name = name;
    }
    public String getMajor() {
        return Major;
    }
    public void setMajor(String major) {
        this.Major = major;
    }
    public double getGpa() {
        return Gpa;
    }
    public void setGpa(double gpa) {
        this.Gpa = gpa;     
    }
    public void displayInfo(){
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + Name);
        System.out.println("Major: " + Major);
        System.out.println("GPA: " + Gpa);
        System.out.println("--------");
    }
}