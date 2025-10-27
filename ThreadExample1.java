// multithreading in java
// by extending thread class inheritance 
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            // System.out.println("Thread " + Thread.currentThread().getName() + " - Count: " + i);
            System.out.println("thread using thread class "+i);
            try {
                Thread.sleep(500); // pause(sleep) for 5 seconds
            } catch (InterruptedException e) {
               // System.out.println(e);
               e.printStackTrace();
            }
        }
    }
}

public class ThreadExample1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        for(int i=0; i <=5; i++) {
            System.out.println("main thread: "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}