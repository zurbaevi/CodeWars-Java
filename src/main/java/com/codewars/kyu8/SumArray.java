package com.codewars.kyu8;

/**
 * @author Zurbaevi Nika
 */
public class SumArray {
    public static double sum(double[] numbers) {
        double sum = 0;
        for (double n : numbers) {
            sum += n;
        }
        return sum;
    }
}
