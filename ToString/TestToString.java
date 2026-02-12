package ToString;

public class TestToString {
    private String name;
    public TestToString(){}
    public TestToString(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        TestToString t1 = new TestToString("John");
        System.out.println(t1.toString());
    }
      public String toString() {
          return "Test toString method  " +name;
  }
}   