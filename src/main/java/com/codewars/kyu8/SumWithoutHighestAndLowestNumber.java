package com.codewars.kyu8;

/**
 * @author Zurbaevi Nika
 */
public class SumWithoutHighestAndLowestNumber {
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length <= 1) {
            return 0;
        }
        int sum = 0, max = -10000, min = 10000;
        for (int number : numbers) {
            sum += number;
            min = Math.min(number, min);
            max = Math.max(number, max);
        }
        return sum - (max + min);
    }
}
