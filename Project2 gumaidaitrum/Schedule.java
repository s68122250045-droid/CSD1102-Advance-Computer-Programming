import java.sql.Time;

public class Schedule {

    private String day;
    private Time startTime;
    private Time endTime;
    private String room;

    public Schedule() {}

    public Schedule(String day, Time startTime, Time endTime, String room) {
        setDay(day);
        setStartTime(startTime);
        setEndTime(endTime);
        setRoom(room);
        validateTimeOrder();
    }

    public void setDay(String day) {
        if (day == null || day.trim().isEmpty()) {
            throw new IllegalArgumentException("day is invalid");
        }
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    public void setStartTime(Time startTime) {
        if (startTime == null) {
            throw new IllegalArgumentException("startTime cannot be null");
        }
        this.startTime = startTime;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setEndTime(Time endTime) {
        if (endTime == null) {
            throw new IllegalArgumentException("endTime cannot be null");
        }
        this.endTime = endTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setRoom(String room) {
        if (room == null || room.trim().isEmpty()) {
            throw new IllegalArgumentException("room is invalid");
        }
        this.room = room;
    }

    public String getRoom() {
        return room;
    }

    private void validateTimeOrder() {
        if (startTime != null && endTime != null) {
            if (!endTime.after(startTime)) {
                throw new IllegalArgumentException("endTime must be after startTime");
            }
        }
    }

    public void checkConflict() {
        System.out.println("From class Schedule = checkConflict");
    }
}