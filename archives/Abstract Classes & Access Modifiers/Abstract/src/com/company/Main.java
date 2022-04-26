package com.company;

public class Main {

        public static void main(String[] args) {
                // abstract =  	abstract classes cannot be instantiated, but they can have a subclass
                //				abstract methods are declared without an implementation

                //              it basically adds a layer of security to your program.

                // A "Vehicle" can no longer be instantiated because it is abstract

                Car c1 = new Car();

                c1.go();
        }
}