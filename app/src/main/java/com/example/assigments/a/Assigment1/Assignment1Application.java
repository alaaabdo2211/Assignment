package com.example.assigments.a.Assigment1;

public class Assignment1Application {

    public static void main(String[] args) {

        Vehicle vehicle = new Car("gasoline", "Corolla", 2011, "Toyota");
        vehicle.printVehicleInfo();

        vehicle = (Vehicle) vehicle;

        System.out.println(vehicle);
    }
}
