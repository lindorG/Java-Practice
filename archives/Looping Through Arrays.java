package com.company;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] cars = {"Camaro", "Corvette", "Tesla"};
        cars[0] = "Toyota";

        for (int i = cars.length-1; i >= 0; i--) {
            System.out.println(cars[i]);
        }

        
        
        // System.out.println(Arrays.toString(cars));
    }
}
