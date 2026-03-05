package threadexample;
     /*public class ThreadEx1 {   // Ex1

        public static void main (String [] args){

            System.out.println("Hello world");

            System.out.println("Thread name : "+Thread.currentThread().getName());

    }

}*/

public class ThreadEx1 { // Ex2

    public static void main(String[] args) {

    MyThread1 t = new MyThread1();

    t.start();

}

}
