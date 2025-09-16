package com.practice;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle(DriveStrategy driveStrategy) {
        super(new SpecialDriveStrategy());
    }
}
