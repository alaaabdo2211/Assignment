package com.example.assigments.a.Assigment1;

public class Motorcycle extends Vehicle {

    private double weight;

    public Motorcycle(String manufacturer, String model, int year, double weight) {
        super(manufacturer, model, year);
        this.weight = weight;
    }

    @Override
    public void printVehicleInfo() {
        super.printVehicleInfo();
        System.out.println("This motorcycle's weight is " + weight);
    }
}
