package com.company;

public class Main {

        public static void main(String[] args) {

                // inheritance = 	the process where one class acquires,
                //					the attributes and methods of another.

                Car c1 = new Car("car");
                Bicycle b1 = new Bicycle("bicycle");

                c1.go();
                b1.stop();
                System.out.println(c1.speed);
                System.out.println(b1.speed);
                System.out.println(c1.doors);
                System.out.println(b1.pedals);
        }
}