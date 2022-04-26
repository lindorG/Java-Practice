package com.company;

public class Main {

        public static void main(String[] args) {
            // printf() = 	an optional method to control, format, and display text to the console window
            //				two arguments = format string + (object/variable/value)
            //				% [flags] [precision] [width] [conversion-character]

            boolean myBoolean = true;
            char myChar = '@';
            String myString = "Bro";
            int myInt = 50;
            double myDouble = 1000;

            // [conversion-character]
            System.out.printf("%b\n", myBoolean);
            System.out.printf("%c\n", myChar);
            System.out.printf("%s\n", myString);
            System.out.printf("%d\n", myInt);
            System.out.printf("%f\n", myDouble);

            // [width] (creates a space between characters)
            // minimum number of characters to be written as output
            System.out.printf("Hello %10s", myString);

            // [precision]
            // sets number of digits of precision when outputting floating-point values
            System.out.printf("\nYou have this much money %.2f ", myDouble);

            // [flags]
            // adds an effect to output based on the flag added to format specifier
            // - : left-justify
            // + : output a plus ( + ) or minus ( - )  sign for numeric value
            // 0 : numeric values are zero-padded
            // , : comma grouping separator if numbers > 100

            System.out.printf("You have this much money %020f", myDouble);
        }
}