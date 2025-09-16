package com.practice;

public class GoodsVehicle extends Vehicle {

    public GoodsVehicle(DriveStrategy driveStrategy) {
        super(new NormalDriveStrategy());
    }

}
