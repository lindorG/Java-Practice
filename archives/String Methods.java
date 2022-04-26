package com.company;

import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String name = "   Bro  ";

        int result = name.length();
        boolean resultOne = name.equals("bro");
        char resultTwo = name.charAt(3);
        int resultThree = name.indexOf("B");
        boolean resultFour = name.isEmpty();
        String resultFive = name.toUpperCase();
        String resultSix = name.toLowerCase();
        String resultSeven = name.trim();
        String resultEight = name.replace("o", "uh");

        System.out.println(result);
        System.out.println(resultOne);
        System.out.println(resultTwo);
        System.out.println(resultThree);
        System.out.println(resultFour);
        System.out.println(resultFive);
        System.out.println(resultSix);
        System.out.println(resultSeven);
        System.out.println(resultEight);
    }
}
