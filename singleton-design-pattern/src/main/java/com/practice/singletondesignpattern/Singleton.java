package com.practice.singletondesignpattern;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton instance created");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void doSomething()
    {
        System.out.println("Somethong is Done.");
    }
}
