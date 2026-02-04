import java.util.ArrayList;
import java.util.List;

public class Department {
    private int department_id;
    private String department_name;
    private List<User> users = new ArrayList<>();
    public Department(int department_id, String department_name) {
            this.department_id = department_id;
            this.department_name = department_name;
        }
        public void insertDepartment() {
                System.out.println("InsertDepartment");
}
        public void updateDepartment() {
                System.out.println("UpdateDepartment");
}
        public void deleteDepartment() {
                System.out.println("DeleteDepartment");
}
}
