package com.practice.abstractfactorydesignpattern.ConcreteCreators;

import com.practice.abstractfactorydesignpattern.ConcreteProducts.CarSpecification;

// Concrete Product for Europe Car Specification
public class EuropeSpecification implements CarSpecification {
    public void display() {
        System.out.println("Europe Car Specification: Fuel efficiency and emissions compliant with EU standards.");
    }
}
