package com.company;

public class Main {

        public static void main(String[] args) {

                int[][] arr = {{1, 2, 3}, {4, 5}, {6}};

                // Prints out contents of multi-dimensional array within brackets (not clean)
                // System.out.println(Arrays.deepToString(arr));

                // Enhanced foreach statement to print out 2D Array
                for (int[] x : arr) {
                        for (int answer : x) {
                                // prinln if you want a list instead of a row
                                System.out.print(answer + " ");
                        }
                }
        }
}