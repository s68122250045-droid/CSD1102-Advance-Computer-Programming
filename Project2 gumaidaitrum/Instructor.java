import java.util.ArrayList;
import java.util.List;

public class Instructor {

    private String instructorId;
    private String instructorName;
    private List<Section> sectionTeaching;

    public Instructor() {
        this.sectionTeaching = new ArrayList<>();
    }

    public Instructor(String instructorId, String instructorName, List<Section> sectionTeaching) {
        setInstructorId(instructorId);
        setInstructorName(instructorName);
        setSectionTeaching(sectionTeaching);
    }

    public String getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(String instructorId) {
        if (instructorId == null || instructorId.trim().isEmpty()) {
            throw new IllegalArgumentException("instructorId is invalid");
        }
        this.instructorId = instructorId;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        if (instructorName == null || instructorName.trim().isEmpty()) {
            throw new IllegalArgumentException("instructorName is invalid");
        }
        this.instructorName = instructorName;
    }

    public List<Section> getSectionTeaching() {
        return sectionTeaching;
    }

    public void setSectionTeaching(List<Section> sectionTeaching) {
        if (sectionTeaching == null) {
            this.sectionTeaching = new ArrayList<>();
        } else {
            this.sectionTeaching = sectionTeaching;
        }
    }

    public void assign(Section section) {
        if (section == null) {
            throw new IllegalArgumentException("section cannot be null");
        }

        if (sectionTeaching == null) {
            sectionTeaching = new ArrayList<>();
        }

        sectionTeaching.add(section);
        System.out.println("From class Instructor = assign");
    }
}