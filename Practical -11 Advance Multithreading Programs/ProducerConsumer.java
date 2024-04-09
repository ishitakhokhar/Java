// WAP to implement the solution to producer consumer problem in Java. 
class product {
    int item;

    void put(int num) {
        this.item = num;
        System.err.println("Produced=" + item);
    }

    synchronized int get() {
        return item;
    }
}

class producer extends Thread {
    product p;

    producer(product p) {
        this.p = p;
        start();
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            synchronized (p) {
                p.put(i);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.err.println("inside catch");
            }
        }
    }
}

class consumer extends Thread {
    product p;

    consumer(product p) {
        this.p = p;
        start();
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            synchronized (p) {
                System.err.println("Consumed=" + p.get());
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.err.println("inside cathc");
            }
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        product obj = new product();
        producer p = new producer(obj);
        consumer c = new consumer(obj);
    }
}
