package threadexample;

public class MyThread1 extends Thread {

@Override

public void run() {

for (int i = 1; i <= 5; i++) {

System.out.println("Thread กำลังทำงาน: " + i);

try {

Thread.sleep(500); 

} catch (InterruptedException e) {

e.printStackTrace();

}

}

}

}