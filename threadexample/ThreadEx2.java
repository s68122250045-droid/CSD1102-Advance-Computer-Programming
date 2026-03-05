package threadexample;

public class ThreadEx2 {

    public static void main(String[] args) throws
        InterruptedException {

    MyThread1 t = new MyThread1();
 
        t.start(); //  ต้องใช้ start() เพื่อให้ Thread ทำงาน โดยจะเรียก run() 

        t.join(); // รอให้ Thread ทำงานเสร็จ แล้วจะแสดงผลต่อจากนั้น

        System.out.println("Main ทำงานต่อ");

}
}