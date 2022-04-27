package com.example.assigments.a.Assignment5;

public class Assignment5Application {


    public static void main(String[] args) {


        //Assignment5

        BiFunction <Integer , Integer , Integer> add = (a,b) -> a+b;

        Function<Integer, Function<Integer, Integer>> currying = a -> b -> add.apply(a,b);


        //Assignment6

        Function<Integer, Function<Integer, Integer>> addFun = a -> b -> a+b;

        BiFunction<Integer , Integer, Integer> uncurrying = (a,b) -> addFun.apply(a).apply(b);




    }

}
