package com.company;

public class Main {
//    method = a block of code that is executed whenever it is called upon, similar to functions
    static void hello(String  parameter, int life) {
        System.out.println("Hello " + parameter);
        System.out.println("You are "+life);
    }
//    Method 1
    static void add(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + secondNumber);
    }
//    Method 2
    static int sum(int firstNumber, int secondNumber) {
        int z = firstNumber + secondNumber;
        return z;
    }
//    Main method
    public static void main(String[] args) {
        String name = "Bro";
        int age = 21;

        int x = 3;
        int y = 4;

        int a = 9;
        int b = 5;

        int z = sum(a,b);
        System.out.println(z);
//        or
        System.out.println(sum(a,b));

        hello(name, age);
        hello(name, age);
        hello(name, age);
        add(x, y);
    }
}
