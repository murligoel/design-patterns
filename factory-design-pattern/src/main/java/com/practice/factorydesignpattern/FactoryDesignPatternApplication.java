package com.practice.factorydesignpattern;

import com.practice.factorydesignpattern.ConcreteCreators.CreatorFactoryInterface.VehicleFactory;
import com.practice.factorydesignpattern.ConcreteCreators.FourWheelerFactory;
import com.practice.factorydesignpattern.ConcreteCreators.TwoWheelerFactory;
import com.practice.factorydesignpattern.ConcreteProducts.ProductInterface.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryDesignPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(FactoryDesignPatternApplication.class, args);
        VehicleFactory twoWheelerFactory = new TwoWheelerFactory();
        Client twoWheelerClient = new Client(twoWheelerFactory);
        Vehicle twoWheeler = twoWheelerClient.getVehicle();
        twoWheeler.printVehicle();

        VehicleFactory fourWheelerFactory = new FourWheelerFactory();
        Client fourWheelerClient = new Client(fourWheelerFactory);
        Vehicle fourWheeler = fourWheelerClient.getVehicle();
        fourWheeler.printVehicle();
    }

}
