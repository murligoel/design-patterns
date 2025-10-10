package com.practice.vehicle;

import com.practice.startegy.DriveStrategy;
import com.practice.startegy.SpecialDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
