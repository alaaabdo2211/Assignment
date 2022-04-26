package com.example.assigments.a.Assigment4;

import com.example.assigments.a.Assigment3.ToUppercaseFunc;

import java.util.Locale;
import java.util.Scanner;

public class Assignment4Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        ToUppercaseFunc<String, String> toUpperFun = a -> name.toUpperCase(Locale.ROOT);

        ToUppercaseFunc<String, String> upperCaseFinal = toUpperFun.compos(toUpperFun);

        System.out.println(upperCaseFinal);

    }

}
