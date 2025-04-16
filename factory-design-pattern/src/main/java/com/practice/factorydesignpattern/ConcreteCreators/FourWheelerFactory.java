package com.practice.factorydesignpattern.ConcreteCreators;

import com.practice.factorydesignpattern.ConcreteCreators.CreatorFactoryInterface.VehicleFactory;
import com.practice.factorydesignpattern.ConcreteProducts.FourWheeler;
import com.practice.factorydesignpattern.ConcreteProducts.ProductInterface.Vehicle;

// Concrete factory class for FourWheeler
public class FourWheelerFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}
