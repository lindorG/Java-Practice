package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // HashMap implements the Map interface (need import)
        // HashMap is similar to ArrayList, but with key-value pairs
        // stores objects, need to use Wrapper Class
        // ex: (name,email),(username,userID),(country,capital)

        HashMap<String, String> countries = new HashMap<>();

        // add a key and value
        countries.put("USA", "Washington D.C");
        countries.put("India", "New Delhi");
        countries.put("Russia", "Moscow");
        countries.put("China", "Beijing");

        System.out.println(countries);

        // This will print the key of the inputted country, which in this case is Russia
        System.out.println(countries.get("Russia"));

        // Displays the size of the Hash Map (every key value pair)
        System.out.println(countries.size());

        // This will overwrite the key of the specified entry (oh god no)
        countries.replace("USA", "Tampa");
        System.out.println(countries);

        // This is a boolean which determines whether this value is in our Hash Map
        System.out.println(countries.containsValue("Beijing"));

        // Enhanced for loop to display all keys and their respective pair
        System.out.println();
        System.out.println("Countries");
        System.out.println("---------");
        for (String x: countries.keySet()) {
            System.out.println(countries.get(x) + ", " + x);
        }

        // Delete an entry. This will include its paired key
        countries.remove("USA");
        System.out.println(countries);

        // This deletes every entry from the Hash Map
        countries.clear();
        System.out.println(countries);
    }
}