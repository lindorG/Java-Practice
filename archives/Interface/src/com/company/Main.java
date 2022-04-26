package com.company;

public class Main {

        public static void main(String[] args) {
                //  interface = a template that can be applied to a class.
                //              Similar to inheritance, but specifies what a class has/must do.
                //              Classes can apply more than one interface, inheritance is limited to one super.

                Rabbit r1 = new Rabbit();
                r1.flee();

                //  Since we're implementing the predator interface, there is going to be no
                //  flee method for hawks.
                Hawk h1 = new Hawk();
                h1.hunt();

                Fish f1 = new Fish();
                f1.flee();
                f1.hunt();
        }
}