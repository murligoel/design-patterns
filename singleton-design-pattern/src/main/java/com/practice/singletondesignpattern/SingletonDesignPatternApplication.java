package com.practice.singletondesignpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonDesignPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(SingletonDesignPatternApplication.class, args);
        Singleton.getInstance().doSomething();
    }

}
