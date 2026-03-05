package threadexample;

public class ThreadEx3 extends Thread {

    public static void main(String arg[]) {

        System.out.println("Main method");
        System.out.println("The main thread is running :" 
                + Thread.currentThread().getName());

        ThreadEx3 t1 = new ThreadEx3();
        t1.start();
    }

    @Override
    public void run() {
        for(int i = 1; i <= 5; i++){
            System.out.println(Thread.currentThread().getName()+" :"+i);
        }
    }
}