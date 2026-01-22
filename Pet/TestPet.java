package Pet;

public class TestPet {
    public static void main(String[] args) {
        Pet p1 = new Bird(1, "loveBird");
        System.out.println(p1);
        System.out.println(p1.toString());
        System.out.println(p1.getAge());
         Pet p2 = new Snake(1, "Yellow");
        System.out.println(p2);
        System.out.println(p2.toString());
        System.out.println(p2.getAge());
    }
    }
