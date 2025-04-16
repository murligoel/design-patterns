package com.practice.factorydesignpattern.ConcreteProducts;

import com.practice.factorydesignpattern.ConcreteProducts.ProductInterface.Vehicle;

public class FourWheeler extends Vehicle {
    public void printVehicle() {
        System.out.println("I am four wheeler");
    }
}
