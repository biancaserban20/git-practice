package com.qa;

import java.util.ArrayList;
import java.util.List;

public class TestBooks {
    public static void main(String[] args) {
//        // Task 2 - ex. 5
//        String[] arr = {"Mike", "Martina", "Peter"};
//        Book b1 = new Book("title", arr, 10.99);
//        Book b2 = new Book("title2", arr, 5.99);
//        Book b3 = new Book("title3", arr, 1.00);
//        System.out.println(b1);
//        System.out.println(b2);
//        System.out.println(b3);
//        System.out.println("-------------------");
//
//        // Task 2 - ex. 6
//        Book[] bookArray = new Book[3];
//
//        // Task 2 - ex. 7
//        bookArray[0] = b1;
//        bookArray[1] = b2;
//        bookArray[2] = b3;
//
//        // Task 2 - ex. 8
//        for (int x = 0; x < bookArray.length; x++){
//            System.out.println(bookArray[x]);
//        }
//
        // Task 2-2
        List<String> options1 = new ArrayList<>();
        List<String> options2 = new ArrayList<>();

        options1.add("heating chairs");
        options1.add("sports mode");
        options1.add( "wide board screen");


        options2.add("autopilot");
        options2.add("sports mode");
        Car car1 = new Car("X6", "BMW", 25000.0, 2022, options1);
        Car car2 = new Car("R5", "Audi", 50000.0,2021, options2);

        Car[] carArray = new Car[2];
        carArray[0] = car1;
        carArray[1] = car2;
        for(int i = 0; i < carArray.length; i++)
            System.out.println(carArray[i]);
    }
}
