package com.company;

public class Main {

        public static void main(String[] args) {
                Pokemon pokemon1 = new Pokemon("Bulbasaur", "Grass", null, 15.2);
                Pokemon pokemon2 = new Pokemon("Ivysaur", "Grass", "Poison", 29);

                pokemon1.eat();
                pokemon2.drink();
                pokemon1.checkWeight();
                pokemon2.checkType();
        }
}