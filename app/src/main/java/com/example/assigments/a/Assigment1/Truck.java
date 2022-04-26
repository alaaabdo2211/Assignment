package com.example.assigments.a.Assigment1;

public class Truck extends Vehicle {

    private int numberOfAxles;


    public Truck(String manufacturer, String model, int year, int numberOfAxles) {
        super(manufacturer, model, year);
        this.numberOfAxles = numberOfAxles;
    }

    @Override
    public void printVehicleInfo() {
        super.printVehicleInfo();
        System.out.println("Truck number's of Axles is" + numberOfAxles);
    }
}
