package com.practice.factorydesignpattern;

import com.practice.factorydesignpattern.ConcreteCreators.CreatorFactoryInterface.VehicleFactory;
import com.practice.factorydesignpattern.ConcreteProducts.ProductInterface.Vehicle;

public class Client {
    private Vehicle pVehicle;

    public Client(VehicleFactory factory) {
        pVehicle = factory.createVehicle();
    }

    public Vehicle getVehicle() {
        return pVehicle;
    }
}
