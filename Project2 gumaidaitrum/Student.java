public class Student {

    private String studentName;
    private String studentId;
    private String faculty;
    private String major;

    public Student() {}

    public Student(String studentName, String studentId,
                   String faculty, String major) throws IllegalArgumentException {

        setStudentName(studentName);
        setStudentId(studentId);
        setFaculty(faculty);
        setMajor(major);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        if (studentName == null || studentName.trim().isEmpty()) {
            throw new IllegalArgumentException("studentName is invalid");
        }
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if (studentId == null || studentId.trim().isEmpty()) {
            throw new IllegalArgumentException("studentId is invalid");
        }
        this.studentId = studentId;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        if (faculty == null || faculty.trim().isEmpty()) {
            throw new IllegalArgumentException("faculty is invalid");
        }
        this.faculty = faculty;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        if (major == null || major.trim().isEmpty()) {
            throw new IllegalArgumentException("major is invalid");
        }
        this.major = major;
    }

    public void enroll() {
        System.out.println("From class Student = enroll");
    }
}