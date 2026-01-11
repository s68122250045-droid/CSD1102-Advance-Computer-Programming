package WorkArrey;

public class Student {
    private String StudentId;
    private String Name;
    private String Major;
    private double Gpa;
public Student (String StudentId, String Name, String Major, double Gpa){
        this.StudentId = StudentId;
        this.Name = Name;
        this.Major = Major;
        this.Gpa = Gpa;
    }
    public String getStudentId() {
        return StudentId;
    }
    public void setStudentId(String studentId) {
        this.StudentId = studentId;
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
    public void DisplayInfo(){
        System.out.println("Student ID: " + StudentId);
        System.out.println("Name: " + Name);
        System.out.println("Major: " + Major);
        System.out.println("GPA: " + Gpa);
        System.out.println("--------");
    }
}