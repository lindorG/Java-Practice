package com.company;

public class Main {

        public static void main(String[] args) {

                Pizza pizza1 = new Pizza("thick crust", "tomato", "mozzarella", "pepperoni");
                Pizza pizza2 = new Pizza("regular crust", "spicy tomato", "swiss cheese");
                Pizza pizza3 = new Pizza("cheese crust", "sweet tomato");
                Pizza pizza4 = new Pizza("garlic crust");
                Pizza pizza5 = new Pizza();

                pizza1.listIngredients();
                pizza2.listIngredients();
                pizza3.listIngredients();
                pizza4.listIngredients();
                pizza5.listIngredients();

        }
}