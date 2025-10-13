package com.practice.singletondesignpattern;

public class ThreadSafeDoubleLockingSingleton  {

    private static ThreadSafeDoubleLockingSingleton instance;

    private ThreadSafeDoubleLockingSingleton() {
        System.out.println("Singleton Constructor Called!");
    }

    // story of 2 threads trying to create the instance at the same time
    // so we apply the lock using the synchronised keyword so that a single thread can access a resource in one time

    private static ThreadSafeDoubleLockingSingleton getInstance() {
        if (instance == null) { // First check (no locking)
            synchronized (ThreadSafeDoubleLockingSingleton.class) { // Lock only if needed
                if (instance == null) { // Second check (after acquiring lock)
                    instance = new ThreadSafeDoubleLockingSingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        ThreadSafeDoubleLockingSingleton singleton = ThreadSafeDoubleLockingSingleton.getInstance();
        ThreadSafeDoubleLockingSingleton singleton2 = ThreadSafeDoubleLockingSingleton.getInstance();

        System.out.println(singleton == singleton2);
    }
}