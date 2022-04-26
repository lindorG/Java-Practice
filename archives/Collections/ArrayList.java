package com.company;

import java.util.ArrayList;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<>();

        food.add("pizza");
        food.add("hambuger");
        food.add("hotdog");

        food.set(0, "sushi");
        food.remove(1);
        // food.clear(); <--- This method clears the array

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i).toUpperCase());
        }
    }
}
