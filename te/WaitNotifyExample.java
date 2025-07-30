package te;


class Shared {
    synchronized void produce() throws InterruptedException {
        System.out.println("Producer waiting...");
        wait();  // releases lock, waits to be notified
        System.out.println("Producer resumed.");
    }

    synchronized void consume() throws InterruptedException {
        Thread.sleep(1000); // simulate delay
        System.out.println("Consumer notifying...");
        notify();  // wakes one waiting thread
    }
}

class Producer implements Runnable {
    Shared shared;

    Producer(Shared shared) {
        this.shared = shared;
    }

    public void run() {
        try {
            shared.produce();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable {
    Shared shared;

    Consumer(Shared shared) {
        this.shared = shared;
    }

    public void run() {
        try {
            shared.consume();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) throws InterruptedException {
        Shared shared = new Shared();

        Thread producer = new Thread(new Producer(shared));
        Thread consumer = new Thread(new Consumer(shared));

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
    }
}
