package com.company;

public class Main {

        public static void main(String[] args) {
//                Encapsulation = attributes of a class will be hidden or private,
//                can be accessed only through methods (getters & setters)
//                you should make attributes private if you don't have a reason to make them public or protected

//                Programs you make should use encapsulation for layers of security

                Car c1 = new Car("Chevrolet", "Camaro", 2021);
//                Car c2 = new Car("Ford", "Mustang", 2022);
//
//                c2.copy(c1);
//                The code below does both line 13 and line 15 simultaneously
                Car c2 = new Car(c1);

                // Without a getter method, the code below does not work because car's variables are private
                // System.out.println(car.make);

                // We created methods within the Car class which "get" the private variables
                // that are otherwise not visible
                System.out.println(c1);
                System.out.println();
                System.out.println(c2);
                System.out.println();
                System.out.println(c1.getMake());
                System.out.println(c1.getModel());
                System.out.println(c1.getYear());
                System.out.println();

                System.out.println(c1.getMake());
                System.out.println(c1.getModel());
                System.out.println(c1.getYear());

                // Using setters, I have redefined the variables of c1
                c1.setModel("Model Y");
                c1.setMake("Tesla");
                c1.setYear(2024);
                System.out.println();
                System.out.println(c1);
                System.out.println();
                System.out.println(c2);
        }
}