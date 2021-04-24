package com.codewars.kyu8;

/**
 * @author Zurbaevi Nika
 */
public class CalculateAverage {
    public static double find_average(int[] array) {
        double total = 0;
        for (int j : array) {
            total = total + j;
        }
        return total / array.length;
    }
}
