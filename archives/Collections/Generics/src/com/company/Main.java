package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Part One
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character[] charArray = {'H', 'E', 'L' , 'L' ,'O'};
        String[] stringArray = {"B", "Y", "E"};


        System.out.print("Integer Array: ");
        displayArray(intArray);
        // The line of code below returns the first index of an array using the generic method created far below
        System.out.println(firstIndex(intArray));

        System.out.print("Double Array: ");
        displayArray(doubleArray);
        System.out.println(firstIndex(doubleArray));

        System.out.print("Character Array: ");
        displayArray(charArray);
        System.out.println(firstIndex(charArray));

        System.out.print("String Array: ");
        displayArray(stringArray);
        System.out.println(firstIndex(charArray));
        System.out.println("Part One has concluded");
        System.out.println("-----------------------");
        System.out.println();

        // Part Two
        MyGenericClass <Integer, Integer> myInt = new MyGenericClass<>(1, 9);
        MyGenericClass <Double, Double> myDouble = new MyGenericClass<>(3.14, 4.04);
        MyGenericClass <Character, Character> myChar = new MyGenericClass('@', "$");
        MyGenericClass <String, Character> myString = new MyGenericClass("Hello", "!");

        ArrayList<String> myFriends = new ArrayList<>();

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());

        // bounded types =      you can create the objects of a class to have data
        //                      of specific derived types ex.Number
    }
    public static <Thing> void displayArray(Thing[] array) {

        for(Thing x : array) {
            System.out.print(x+" ");
        }
        System.out.println();
    }

    // Generic method with generic return type
    public static <Thing> Thing firstIndex(Thing[] array) {
        return array[0];
    }
}