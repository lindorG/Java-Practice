package com.company;

public class Main {

        public static void main(String[] args) {
                // polymorphism = 	greek word for poly-"many", morph-"form"
                //					The ability of an object to identify as more than one type

                Car c1 = new Car();
                Bicycle b1 = new Bicycle();
                Boat bt1 = new Boat();

                Vehicle[] racers = {c1, b1, bt1};

                // This enhanced for loop allows you to perform a method per Vehicle (Object Class)
                // that exist within the "racers" Array
                for (Vehicle x : racers) {
                        x.go();
                }

                // You could change "Vehicle[]" to "Object[]" -- which would require a
                // few obvious changes within the enhanced for-loop
        }
}