package com.practice.abstractfactorydesignpattern.ConcreteCreators;

import com.practice.abstractfactorydesignpattern.ConcreteProducts.Car;

public class Hatchback implements Car {
    public void assemble() {
        System.out.println("Assembling Hatchback car.");
    }
}
