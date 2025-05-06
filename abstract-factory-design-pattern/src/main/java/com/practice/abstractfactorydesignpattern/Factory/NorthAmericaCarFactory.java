package com.practice.abstractfactorydesignpattern.Factory;

import com.practice.abstractfactorydesignpattern.ConcreteCreators.NorthAmericaSpecification;
import com.practice.abstractfactorydesignpattern.ConcreteCreators.Sedan;
import com.practice.abstractfactorydesignpattern.ConcreteProducts.Car;
import com.practice.abstractfactorydesignpattern.ConcreteProducts.CarSpecification;

// Concrete Factory for North America Cars
public class NorthAmericaCarFactory implements CarFactory {
    public Car createCar() {
        return new Sedan();
    }

    public CarSpecification createSpecification() {
        return new NorthAmericaSpecification();
    }
}

