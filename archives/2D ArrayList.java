package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("soda");
        drinkList.add("coffee");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);

        // Printing out a specific element within a 2D ArrayList (no brackets) using xy coordinates
        System.out.println(groceryList.get(0).get(2));

        // Nested for loop using a 2D ArrayList?
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println();
            for (int j = 0; j < groceryList.get(i).size(); j++) {
                System.out.println(groceryList.get(i));
            }
        }

    }
}
