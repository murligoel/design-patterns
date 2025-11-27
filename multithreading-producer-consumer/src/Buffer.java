import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
    private Queue<Integer> queue = new LinkedList<Integer>();
    private final int CAPACITY = 10;

    public synchronized void produce(int item) throws InterruptedException {
        while(queue.size() == CAPACITY) {
            System.out.println("Buffer full, producer waiting...");
            wait(); // Wait until consumer consumes
        }

        queue.add(item);
        System.out.println("Producer produced: " + item);
        notify();  // Notify consumer that something is produced
    }

    public synchronized int consume() throws InterruptedException {
        while(queue.size() == 0) {
            System.out.println("Buffer empty, consumer waiting...");
            wait();
        }

        int  item = queue.poll();
        System.out.println("Consumer consumed: " + item);
        notify();
        return item;
    }
}
