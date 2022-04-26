package com.company;

import java.util.Random;

public class DiceRoller {

//    Declaring the randoms globally as seen below
    Random random;
    int number = 0;

//    No longer needing to declare them here as seen below
    DiceRoller(){
        random = new Random();
        roll();
    }

    void roll() {
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
/*
 Method #1 of writing this code:
 public class DiceRoller {

    DiceRoller(){
        Random random = new Random();
        int number = 0;
        roll(random, number);
    }

    void roll(Random random, int number) {
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
*/