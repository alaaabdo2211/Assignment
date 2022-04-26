package com.example.assigments.a.Assigment1;

public class Car  extends Vehicle {
    private String fuelType;


    public Car(String manufacturer, String model, int year, String type) {
        super(manufacturer, model, year);
        this.fuelType = type;
    }

    @Override
    public void printVehicleInfo() {
        super.printVehicleInfo();
        System.out.println("This Car's type is" + fuelType);
    }
}
