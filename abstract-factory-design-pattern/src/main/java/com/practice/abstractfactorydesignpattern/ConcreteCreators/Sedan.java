package com.practice.abstractfactorydesignpattern.ConcreteCreators;

import com.practice.abstractfactorydesignpattern.ConcreteProducts.Car;

// Concrete Product for Sedan Car
public class Sedan implements Car {
    public void assemble() {
        System.out.println("Assembling Sedan car.");
    }
}