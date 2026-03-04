import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseId;
    private String courseName;
    private List<Course> prerequisites;

    public Course() {
        this.prerequisites = new ArrayList<>();
    }

    public Course(String courseId, String courseName, List<Course> prerequisites) {
        setCourseId(courseId);
        setCourseName(courseName);
        setPrerequisites(prerequisites);
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        if (courseId == null || courseId.trim().isEmpty()) {
            throw new IllegalArgumentException("courseId cannot be null or empty");
        }
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        if (courseName == null || courseName.trim().isEmpty()) {
            throw new IllegalArgumentException("courseName cannot be null or empty");
        }
        this.courseName = courseName;
    }

    public List<Course> getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(List<Course> prerequisites) {
        if (prerequisites == null) {
            throw new IllegalArgumentException("prerequisites cannot be null");
        }
        this.prerequisites = prerequisites;
    }
    public void addPrerequisite(Course course) {
        if (course == null) {
            throw new IllegalArgumentException("prerequisite course cannot be null");
        }
        prerequisites.add(course);
        System.out.println("Prerequisite added");
    }
    public boolean checkPrerequisite() {
        if (prerequisites == null || prerequisites.isEmpty()) {
            System.out.println("No prerequisites");
            return false;
        }
        System.out.println("Has prerequisites");
        return true;
    }
}