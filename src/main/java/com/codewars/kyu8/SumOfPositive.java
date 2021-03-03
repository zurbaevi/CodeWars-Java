package com.codewars.kyu8;

/**
 * @author Zurbaevi Nika
 */
public class SumOfPositive {
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum;
    }
}
