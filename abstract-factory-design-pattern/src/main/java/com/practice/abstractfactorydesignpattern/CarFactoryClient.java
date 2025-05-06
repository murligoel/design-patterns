package com.practice.abstractfactorydesignpattern;

import com.practice.abstractfactorydesignpattern.ConcreteProducts.Car;
import com.practice.abstractfactorydesignpattern.ConcreteProducts.CarSpecification;
import com.practice.abstractfactorydesignpattern.Factory.CarFactory;
import com.practice.abstractfactorydesignpattern.Factory.EuropeCarFactory;
import com.practice.abstractfactorydesignpattern.Factory.NorthAmericaCarFactory;

// Client Code
public class CarFactoryClient {
    public static void main(String[] args) {
        // Creating cars for North America
        CarFactory northAmericaFactory = new NorthAmericaCarFactory();
        Car northAmericaCar = northAmericaFactory.createCar();
        CarSpecification northAmericaSpec = northAmericaFactory.createSpecification();

        northAmericaCar.assemble();
        northAmericaSpec.display();

        // Creating cars for Europe
        CarFactory europeFactory = new EuropeCarFactory();
        Car europeCar = europeFactory.createCar();
        CarSpecification europeSpec = europeFactory.createSpecification();

        europeCar.assemble();
        europeSpec.display();
    }
}