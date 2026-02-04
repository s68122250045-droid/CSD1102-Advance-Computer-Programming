public class User extends Login  {
    private int user_id;
    private int department_id;
    private String department_name;
    private String department_password;
    private String user_name;
    private Gender user_gender;
    private String user_email;
    private RoleUser user_role;
    public User(int user_id, int department_id, String department_name, String department_password, String user_name, Gender user_gender, String user_email, RoleUser user_role, String username, String password) {
        super(username, password);
        this.user_id = user_id;
        this.department_id = department_id;
        this.department_name = department_name;
        this.department_password = department_password;
        this.user_name = user_name;
        this.user_gender = user_gender;
        this.user_email = user_email;
        this.user_role = user_role;
    }
    
    public void userLogin() {
        System.out.println("UserLogin");
    }
    public void addProposal() {
        System.out.println("AddProposal");
        }
        public void viewProposal() {
        System.out.println("ViewProposal");
        }
        public void confirmProposal() {
        System.out.println("ConfirmProposal");
        }
        public void creatReports() {
        System.out.println("CreateReports");
        }
        public void viewReports() {
        System.out.println("ViewReports");
        }
        public void updateDepartment() {
        System.out.println("UpdateDepartment");
        }
}