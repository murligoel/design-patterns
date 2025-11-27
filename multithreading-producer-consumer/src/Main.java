//Consumer Problem Using Multithreading in Java
//You are tasked with solving the Producer-Consumer problem using Java multithreading.
//        Scenario:
//You have a shared buffer that can store a limited number of items (e.g., integers).
//Two types of threads interact with this buffer:
//Producer Thread: This thread generate items (integers) and add them to the shared buffer.
//Consumer Thread: This thread remove items from the shared buffer and process them.
//        Requirements:
//The buffer has a fixed size (capacity of 10 items).
//If the buffer is full, the producer thread should wait until the consumer removes an item.
//If the buffer is empty, the consumer thread should wait until the producer adds an item.
//You must implement synchronization between the producer and consumer threads using wait() and notify().
//The producer thread should simulate producing an item every second.
//The consumer thread should simulate consuming an item every two seconds.
//        Task:
//Write a Java program that:
//Uses a shared buffer (queue) with a capacity of 10.
//Implements a Producer thread that continuously generates items and adds them to the buffer.
//Implements a Consumer thread that continuously removes items from the buffer and processes them.
//Synchronizes the producer and consumer threads to ensure:
//The producer waits when the buffer is full.
//The consumer waits when the buffer is empty.
//Simulates a real-world production and consumption rate (producer adds items every 1 second, consumer removes items every 2 seconds).
//Additional Considerations:
//Use Java's built-in multithreading features, specifically Thread, synchronized, wait(), and notify().
//The solution should handle edge cases where the buffer is either full or empty.
//Example Output:
//Produced: 0
//Produced: 1
//Consumed: 0
//Produced: 2
//Produced: 3
//Consumed: 1
//Guidelines:
//Focus on writing clean, maintainable, and thread-safe code.
//Ensure proper synchronization and avoid issues like deadlock or missed signals.//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}