import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class TestStudent {
    public static void main(String[] args) {

        try {
            Student s1 = new Student();
            s1.setStudentId("68122250045");
            System.out.println(s1.getStudentId());

            Student s2 = new Student("Panupong","68122250045","Science","Computer Science");
            System.out.println(s2.getStudentName() + " " + s2.getStudentId());

    
            Student s = new Student();
            s.enroll();

        } catch (Exception e) {
            System.out.println("Student Error: " + e.getMessage());
        }

        try {
            Course c1 = new Course();
            c1.setCourseId("CSD1102");
            System.out.println(c1.getCourseId());

            Course c2 = new Course("CSD1102","Computer Science", new ArrayList<>());
            c2.addPrerequisite(c1);

        } catch (Exception e) {
            System.out.println("Course Error: " + e.getMessage());
        }

        try {
            Schedule sc2 = new Schedule("Monday",
                    Time.valueOf("13:00:00"),
                    Time.valueOf("17:00:00"),
                    "Room 2234");
            sc2.checkConflict();
        } catch (Exception e) {
            System.out.println("Schedule Error: " + e.getMessage());
        }

   
        try {
            Section sec2 = new Section("001", 50, 30, null);
            sec2.checkseat();
        } catch (Exception e) {
            System.out.println("Section Error: " + e.getMessage());
        }

        try {
            Instructor in2 = new Instructor("123456", "Kui", new ArrayList<>());
            in2.assign(null); // 🔥 ทดสอบ error
        } catch (Exception e) {
            System.out.println("Instructor Error: " + e.getMessage());
        }


        try {
            Enrollment e2 = new Enrollment(new Date(), "Cancel");
            e2.cancel();
        } catch (Exception e) {
            System.out.println("Enrollment Error: " + e.getMessage());
        }
    }
}