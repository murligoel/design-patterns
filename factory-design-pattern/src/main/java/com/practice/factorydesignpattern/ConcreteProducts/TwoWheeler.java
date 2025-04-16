package com.practice.factorydesignpattern.ConcreteProducts;

import com.practice.factorydesignpattern.ConcreteProducts.ProductInterface.Vehicle;

// Concrete product classes representing different types of vehicles
public class TwoWheeler extends Vehicle {
    public void printVehicle() {
        System.out.println("I am two wheeler");
    }
}
