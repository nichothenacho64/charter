package org.charter;

import java.util.*;

final class Functions {
    public void variables() {
        byte a = 5; // 8-bit
        short b = 6; // 16-bit
        int c = 7; // 32-bit
        long d = 100000; // 64-bit
        float e = 9.123456f; // 32-bit float, don't use for precise values
        double f = 18.123456; // 64-bit float
        boolean yeah = true;
        char superCool = 'e'; // single quotes
        String s = "a string"; // double quotes

        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] sameThing = new int[10];
        sameThing[0] = 1;

        for (int number : intArray) {
            System.out.println(number);
        }
        Arrays.stream(sameThing).map(number -> number + 1);

        // null can be used for anything except for primitive types
//        .map(coffee -> coffee + " ").forEach(System.out::print);
    }
}

public class Main {
    public static void main(String[] args) {
//        Functions f = new Functions();
//        f.variables();

        System.out.println("Hello!");
        String[] busLocations = {"Place A", "Place B"};

        Bus bus = new Bus("100", busLocations);
        System.out.println(bus.number);
        Bus.splitBusPlaceValues("PlaceA PlaceB PlaceC PlaceD");
    }
}

// https://dev.java/learn/language-basics/variables/
// constant int NUM_BUSES = 6