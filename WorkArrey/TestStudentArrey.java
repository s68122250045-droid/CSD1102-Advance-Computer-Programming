package WorkArrey;

public class TestStudentArrey {
    public static void main(String[] args) {
        Student[] Students = new Student[3];
        Students[0] = new Student("68122250045", "Panupong", "Computer Science", 3.00);
        Students[1] = new Student("68122250000", "Digda", "Computer Science", 3.50);
        Students[2] = new Student("68122251111", "diglett", "IT", 3.20);

        for (int i = 0; i < Students.length; i++) {
            Students[i].displayInfo();
        }
    }
}
