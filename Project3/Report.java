import java.util.Date;
public class Report  {
    private int Report_code;
    private Date Report_date;
    public Report(int report_code, Date report_date) {
        this.Report_code = report_code;
        this.Report_date = report_date;
    }
    
    public void viewReports(){
        System.out.println("ViewReports");
    }
    public void createReports(){
        System.out.println("CreateReports");
    }
    
}
