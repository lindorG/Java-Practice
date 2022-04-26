package com.company;

public class Car {

    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year = 2021;

    @Override
    public String toString() {
        String myString = "Make: " + this.make + "\n" + "Model: " + this.model + "\n" + "Color: " + this.color + "\n" + "Year: " + this.year;
//        System.out.println("Make: ");System.out.println(this.make);
//        System.out.println("Model: ");System.out.println(this.model);
//        System.out.println("Color: ");System.out.println(this.color);
//        System.out.println("Year: ");System.out.println(this.year);
        return myString;
    }
}
