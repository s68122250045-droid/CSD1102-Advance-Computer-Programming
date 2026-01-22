import java.util.Date;
public class TestDate {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now.toString());
        System.out.println("Year: " + (now.getYear() + 1900));
    }
}