package com.practice.factorydesignpattern.ConcreteCreators;

import com.practice.factorydesignpattern.ConcreteCreators.CreatorFactoryInterface.VehicleFactory;
import com.practice.factorydesignpattern.ConcreteProducts.TwoWheeler;
import com.practice.factorydesignpattern.ConcreteProducts.ProductInterface.Vehicle;

public class TwoWheelerFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}