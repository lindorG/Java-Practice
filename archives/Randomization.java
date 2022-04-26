package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Could probably make a Gacha game out of code from this main method
        Random random = new Random();
        int x = random.nextInt(6)+1; // Offers a random int 1-7
        double y = random.nextDouble(); // Offers a random double 0-1
        boolean z = random.nextBoolean(); // Random T/F
    }
}
