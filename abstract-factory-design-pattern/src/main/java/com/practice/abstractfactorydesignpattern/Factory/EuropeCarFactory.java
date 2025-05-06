package com.practice.abstractfactorydesignpattern.Factory;

import com.practice.abstractfactorydesignpattern.ConcreteCreators.EuropeSpecification;
import com.practice.abstractfactorydesignpattern.ConcreteCreators.Hatchback;
import com.practice.abstractfactorydesignpattern.ConcreteProducts.Car;
import com.practice.abstractfactorydesignpattern.ConcreteProducts.CarSpecification;

public class EuropeCarFactory implements CarFactory {
    public Car createCar() {
        return new Hatchback();
    }

    public CarSpecification createSpecification() {
        return new EuropeSpecification();
    }
}