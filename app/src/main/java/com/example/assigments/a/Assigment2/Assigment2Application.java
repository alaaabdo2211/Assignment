package com.example.assigments.a.Assigment2;

import java.util.Scanner;

public class Assigment2Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name:");

        String name = scanner.nextLine();

        AppendFunc<String , String> helloName =a -> String.format("Hello %s" , name);

        System.out.println(helloName);

    }
}
