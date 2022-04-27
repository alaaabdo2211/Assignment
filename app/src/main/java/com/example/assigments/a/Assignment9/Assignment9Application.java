package com.example.assigments.a.Assignment9;

import java.util.StringJoiner;
import java.util.stream.Stream;

public class Assignment9Application {


    static Cars[] carsList = new Cars[]{
            new Cars("Kia", "red", 2020),
            new Cars("Mercedes", "black", 2022),
            new Cars("Hyundai", "white", 2018)
    };


    public static void main(String[] args) {

        Stream.of(Assignment9Application.carsList).forEach(cl -> {
            System.out.println(cl);
        });

        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
        System.out.println(stringJoiner);


    }


}
