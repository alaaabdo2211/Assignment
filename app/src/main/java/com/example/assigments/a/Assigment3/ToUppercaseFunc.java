package com.example.assigments.a.Assigment3;

public interface ToUppercaseFunc<T, U> {

    public U toUpperCase(T t);


    default <D> ToUppercaseFunc<D, U> compos(ToUppercaseFunc<D, T> g) {

        return x -> toUpperCase(g.toUpperCase(x));

    }
}
