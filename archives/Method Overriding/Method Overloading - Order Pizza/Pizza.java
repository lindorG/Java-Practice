package com.company;

public class Pizza {

    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza() {
    }

    Pizza(String bread) {
        this.bread = bread;
    }

    Pizza(String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;
    }

    Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    Pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

    void listIngredients() {
        System.out.println("Here are the ingredients of your pizza: ");
        System.out.print("Bread: ");System.out.println(this.bread);
        System.out.print("Sauce: ");System.out.println(this.sauce);
        System.out.print("Cheese: ");System.out.println(this.cheese);
        System.out.print("Topping: ");System.out.println(this.topping);
        System.out.println();
    }
}