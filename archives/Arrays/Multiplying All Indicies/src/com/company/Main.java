package com.company;

public class Main {

        public static void main(String[] args) {


                // Manual
                int arr[] = {1, 2, 3, 4, 5};
                System.out.println(arr[0]*arr[1]*arr[2]*arr[3]*arr[4]);

                int answer = 1;


                // Automated
                for(int x : arr) {
                        answer *= x; // answer = answer * x
                }
                System.out.println(answer);
        }
}
