package WorkArrey;

public class TestStudentArrey {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("68122250045", "Panupong", "Computer Science", 3.00);
        students[1] = new Student("68122250000", "Digda", "Computer Science", 3.50);
        students[2] = new Student("68122251111", "diglett", "IT", 3.20);

        for (int i = 0; i < students.length; i++) {
            students[i].displayInfo();
        }
    }
}
