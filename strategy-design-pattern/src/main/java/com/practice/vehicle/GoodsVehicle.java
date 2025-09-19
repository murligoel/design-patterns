package com.practice.vehicle;

import com.practice.startegy.DriveStrategy;
import com.practice.startegy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {

    public GoodsVehicle(DriveStrategy driveStrategy) {
        super(new NormalDriveStrategy());
    }

}
