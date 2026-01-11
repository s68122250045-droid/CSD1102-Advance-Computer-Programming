package WorkArrey;

public class Student {
    private String studentid;
    private String name;
    private String major;
    private double gpa;
public Student (String studentid, String name, String major, double gpa){
        this.studentid = studentid;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }
    public String getStudentid() {
        return studentid;
    }
    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }
    public String getName() {

        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;     
    }
    public void displayInfo(){
        System.out.println("Student ID: " + studentid);
        System.out.println("Name: " + name);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
        System.out.println("--------");
    }
}