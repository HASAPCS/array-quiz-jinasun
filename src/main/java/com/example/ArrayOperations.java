package com.example;

public class ArrayOperations {
    // Exercise 1: Find the Maximum Value in an Array
    public static int findMaximumValue(int[] array) {
        int max = array[0];

        for (int i = 1; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
        // TODO: Implement the logic to find the maximum value in the array.
         // Placeholder return value
    }

    // Exercise 2: Calculate the Average of Array Elements
    public static double calculateAverage(int[] array) {
        int sum = 0;

        for (int aa: array){
            sum+=aa;
        }
        // TODO: Implement the logic to calculate the average of the array elements.
        return sum/array.length; // Placeholder return value
    }

    // Exercise 3: Reverse an Array
    public static int[] reverseArray(int[] array) {
        for (int i = 1;i<array.length/2;i++){
            int temp array[array.length-1-i];
            

        }
            

        // TODO: Implement the logic to reverse the array.
        return new int[0]; // Placeholder return value
    }
}
