package com.practice.factorydesignpattern.ConcreteCreators.CreatorFactoryInterface;

import com.practice.factorydesignpattern.ConcreteProducts.ProductInterface.Vehicle;

// Factory interface defining the factory method
public interface VehicleFactory {
    Vehicle createVehicle();
}
