package Exception;
public class TestDemoException1 {

static void checkAge(int age) {
if (age < 18) {
throw new MyException("Age must be at least 18");
    }
}
public static void main(String[] args) {
try {
checkAge(15);
} catch (MyException e) {
System.out.println("Error: " + e.getMessage());
        }
    }
}