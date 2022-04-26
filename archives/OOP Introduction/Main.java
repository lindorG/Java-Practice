package com.company;

public class Main {

        public static void main(String[] args) {
            // object - an instance of a class that may contain attributes and methods
            // example: (phone, desk, computer, coffee cup)
                myChar1();

        }

        static void myChar1() {
                Car myCar = new Car();
                System.out.println(myCar.make);
                System.out.println(myCar.model);

                myCar.drive();
                myCar.brake();
        }

        static void myChar2() {
                Car myCar = new Car();

        }
}