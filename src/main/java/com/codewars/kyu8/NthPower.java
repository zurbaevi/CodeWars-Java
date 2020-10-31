package com.codewars.kyu8;

/**
 * @author Nika Zurbaevi
 */
public class NthPower {
    public static int nthPower(int[] array, int n) {
        if (array.length <= n || 0 > n) {
            return -1;
        } else {
            return (int) Math.pow(array[n], n);
        }
    }
}
