package com.company;

public class Pokemon {

    String name;
    String primaryType;
    String secondaryType;
    double weight;

    Pokemon(String name, String primaryType, String secondaryType, double weight) {
        this.name = name;
        this.primaryType = primaryType;
        this.secondaryType = secondaryType;
        this.weight = weight;
    }

    void eat() {
        System.out.println(this.name + " is eating");
    }

    void drink() {
        System.out.println(this.name + " is drinking");
    }

    void checkType() {
        System.out.printf("%s's type is %s/%s\n", this.name, this.primaryType, this.secondaryType);
    }

    void checkWeight() {
        System.out.printf("%s weighs %.1f lbs.\n", this.name, this.weight);
    }
}
