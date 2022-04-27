package com.example.assigments.a.Assignment9;

public class Cars {

private final String model;
private final String color;
private final int year;

    public Cars(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }


    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}
