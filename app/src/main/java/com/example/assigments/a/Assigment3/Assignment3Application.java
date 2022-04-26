package com.example.assigments.a.Assigment3;

import java.util.Locale;
import java.util.Scanner;

public class Assignment3Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any String");

        String passedChar = scanner.nextLine();

        ToUppercaseFunc<String, String> upperCaseString = a -> passedChar.toUpperCase(Locale.ROOT);

        System.out.println(upperCaseString);

    }


}
