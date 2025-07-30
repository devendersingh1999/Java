package te;


class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " - " + i);
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}

public class ThreadRunner {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        
        t1.start();
        t2.start();
        t2.join();  // Main thread waits until t2 finishes

    }
}