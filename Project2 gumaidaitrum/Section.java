public class Section {

    private String sectionId;
    private int sectionCapacity;
    private int currentSeat;
    private Instructor instructor;

    public Section() {}

    public Section(String sectionId, int sectionCapacity,
                   int currentSeat, Instructor instructor) {

        setSectionId(sectionId);
        setSectionCapacity(sectionCapacity);
        setCurrentSeat(currentSeat);
        setInstructor(instructor);
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        if (sectionId == null || sectionId.trim().isEmpty()) {
            throw new IllegalArgumentException("sectionId is invalid");
        }
        this.sectionId = sectionId;
    }

    public int getSectionCapacity() {
        return sectionCapacity;
    }

    public void setSectionCapacity(int sectionCapacity) {
        if (sectionCapacity <= 0) {
            throw new IllegalArgumentException("sectionCapacity must be greater than 0");
        }
        this.sectionCapacity = sectionCapacity;
    }

    public int getCurrentSeat() {
        return currentSeat;
    }

    public void setCurrentSeat(int currentSeat) {
        if (currentSeat < 0) {
            throw new IllegalArgumentException("currentSeat cannot be negative");
        }
        if (currentSeat > sectionCapacity) {
            throw new IllegalArgumentException("currentSeat cannot exceed sectionCapacity");
        }
        this.currentSeat = currentSeat;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        if (instructor == null) {
            throw new IllegalArgumentException("Instructor cannot be null");
        }
        this.instructor = instructor;
    }

    public void checkseat() {
        System.out.println("Current seat: " + currentSeat + "/" + sectionCapacity);
    }

    public void addseat() {
        if (currentSeat >= sectionCapacity) {
            throw new IllegalStateException("Section is full");
        }
        currentSeat++;
        System.out.println("Seat added");
    }

    public void removeseat() {
        if (currentSeat <= 0) {
            throw new IllegalStateException("No seat to remove");
        }
        currentSeat--;
        System.out.println("Seat removed");
    }
}