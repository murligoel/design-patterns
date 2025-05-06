package com.practice.abstractfactorydesignpattern.Factory;

import com.practice.abstractfactorydesignpattern.ConcreteProducts.Car;
import com.practice.abstractfactorydesignpattern.ConcreteProducts.CarSpecification;

// Abstract Factory Interface
public interface CarFactory {
    Car createCar();
    CarSpecification createSpecification();
}
