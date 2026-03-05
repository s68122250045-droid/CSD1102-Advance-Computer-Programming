package Exception;
public class TestExample {
    private int count =0;

    public static void main(String[] args) {
        try {
        TestExample ex = new TestExample();
        ex.f();
        System.out.println(ex.count);
        } catch (Exception e) {
            System.out.println("Boom");
        }
    }
    public void f() throws Exception{
        add(2);
        mult(3);
    }
    public void add(int val) throws Exception{
        if(val==2)
            throw new Exception();
        count+=val;

    }
    public void mult(int val) {
        count*=val;
    }
}