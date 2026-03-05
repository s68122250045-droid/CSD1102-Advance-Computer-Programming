package threadexample;

public class MyRunnable implements Runnable {

@Override

public void run() {

for (int i = 1; i <= 5; i++) {

System.out.println("Runnable กำลังทำงาน: " + i);

try {

Thread.sleep(500);

} catch (InterruptedException e) {

e.printStackTrace();

}

}

}

}