package com.practice;

import com.practice.startegy.SpecialDriveStrategy;
import com.practice.vehicle.OffRoadVehicle;
import com.practice.vehicle.Vehicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new OffRoadVehicle(new SpecialDriveStrategy());
        vehicle.drive();
    }
}