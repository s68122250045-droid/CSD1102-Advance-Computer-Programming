import java.util.Date;

public class Enrollment {

    private Date enrollmentDate;
    private String status;

    public Enrollment() {}

    public Enrollment(Date enrollmentDate, String status) {
        setEnrollmentDate(enrollmentDate);
        setStatus(status);
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        if (enrollmentDate == null) {
            throw new IllegalArgumentException("enrollmentDate cannot be null");
        }
        this.enrollmentDate = enrollmentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status == null || status.trim().isEmpty()) {
            throw new IllegalArgumentException("status is invalid");
        }

        if (!status.equalsIgnoreCase("Confirm") &&
            !status.equalsIgnoreCase("Cancel")) {
            throw new IllegalArgumentException("status must be Confirm or Cancel");
        }

        this.status = status;
    }

    public void confirm() {
        if (status != null && status.equalsIgnoreCase("Cancel")) {
            throw new IllegalStateException("Cannot confirm a cancelled enrollment");
        }
        this.status = "Confirm";
        System.out.println("Enrollment confirmed");
    }

    public void cancel() {
        if (status != null && status.equalsIgnoreCase("Confirm")) {
            throw new IllegalStateException("Cannot cancel a confirmed enrollment");
        }
        this.status = "Cancel";
        System.out.println("Enrollment cancelled");
    }
}