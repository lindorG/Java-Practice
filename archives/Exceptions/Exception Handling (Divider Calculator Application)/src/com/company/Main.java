package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) throws FileNotFoundException {
        // exception = 	an event that occurs during the execution of a program that,
        //				disrupts the normal flow of instructions

        Scanner scanner = new Scanner (System.in);

        try {
            FileReader reader = new FileReader("Welcome Mat.txt");
            int data = reader.read();
            while(data != -1) {
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();
        try {
            // The code within the "try" scope has the foreseeable issue of someone entering a string or decimal value
            System.out.println("This dumb calculator only seems to read and divide integer values.\nThis means that decimal calculations will be automatically rounded to the nearest integer.\n");
            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number ot divide by: ");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("result: " + z);
        }
        // This "catch" block of code allows you to handle these exception errors. It's similar to conditional if variants
        catch(ArithmeticException f) {
            System.out.println("You cannot divide by zero! (moron)");
        }
        catch(InputMismatchException f) {
            System.out.println("PLEASE ENTER AN INTEGER!! SMH I CAN'T");
        }
        catch (Exception f) {
            System.out.println("Something went wrong!");
        }
        // "finally" states the final thing that will be done
        finally {
            System.out.println("Thank you for using this program");
            scanner.close();
        }
    }
}
