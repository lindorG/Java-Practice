package com.company;

public class Vehicle {
    double speed;
    String name;

    Vehicle (String name) {
        this.name = name;
    }

    void go() {
        System.out.println("This " + name + " is moving");
    }

    void stop() {
        System.out.println("This "+ name + " is stopped");
    }
}
