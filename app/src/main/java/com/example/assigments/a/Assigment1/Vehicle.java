package com.example.assigments.a.Assigment1;

public class Vehicle {

    private String manufacturer;

    private String model;

    private int year;

    public Vehicle(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }



    public void printVehicleInfo(){
        System.out.println("This vehicle is a " + year + "" + manufacturer + "" + model);
    }
}
