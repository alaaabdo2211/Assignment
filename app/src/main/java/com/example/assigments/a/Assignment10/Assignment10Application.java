package com.example.assigments.a.Assignment10;

import static com.example.assigments.a.Assignment10.Courses.ARABIC;
import static com.example.assigments.a.Assignment10.Courses.ENGLISH;
import static com.example.assigments.a.Assignment10.Courses.MATH;
import static com.example.assigments.a.Assignment10.Courses.SCIENCE;
import static com.example.assigments.a.Assignment10.Gender.FEMALE;
import static com.example.assigments.a.Assignment10.Gender.MALE;
import static java.util.Arrays.asList;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Assignment10Application {

    static Student[] students = new Student[]{
            new Student("Sarah", 23, FEMALE, true, asList(MATH, ENGLISH, ARABIC)),
            new Student("Fawzi", 25, MALE, true, asList(MATH, ARABIC)),
            new Student("Ahlam", 19, FEMALE, false, asList(ENGLISH, ARABIC)),
            new Student("Fahed", 36, MALE, true, asList(ENGLISH, SCIENCE)),
            new Student("Maha", 29, FEMALE, false, asList(ARABIC, MATH, ENGLISH, SCIENCE)),
            new Student("Musa", 32, MALE, true, asList(ARABIC, MATH, ENGLISH, SCIENCE))

    };


    public static void main(String[] args) {

        List<Student> listOfStudents =

                Stream.of(students)
                        .reduce(new ArrayList<Student>(), (acc, e) -> {

                            ArrayList<Student> studentArrayList = new ArrayList<>(acc);
                            studentArrayList.add(e);
                            return studentArrayList;
                        }, (acc1, acc2) -> acc1);

        System.out.println(listOfStudents);


    }
}
