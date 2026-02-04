public class Applicant {
    private String Applicant_id;
    private String Applicant_name;
    private String Applicant_job;
    private String Applicant_address;
    private String Applicant_gender;
    private String Applicant_tel;
        public Applicant(String applicant_id, String applicant_name, String applicant_job, String applicant_address, String applicant_gender, String applicant_tel) {
            this.Applicant_id = applicant_id;
            this.Applicant_name = applicant_name;
            this.Applicant_job = applicant_job;
            this.Applicant_address = applicant_address;
            this.Applicant_gender = applicant_gender;
            this.Applicant_tel = applicant_tel;
        }
        public void insertApplicant() {
            System.out.println("InsertApplicant");
        }
        public void updateApplicant() {
            System.out.println("UpdateApplicant");
        }
        public void deleteApplicant() {
            System.out.println("DeleteApplicant");
        }
}