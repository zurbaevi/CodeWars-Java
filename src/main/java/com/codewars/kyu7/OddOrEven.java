package com.codewars.kyu7;

import java.util.Arrays;

/**
 * @author Zurbaevi Nika
 */
public class OddOrEven {
    public static String oddOrEven (int[] array) {
        if (array.length == 0) {
            return "even";
        }

        long sum = Arrays.stream(array).sum();
        if (sum % 2 == 0) {
            return "even";
        }
        else {
            return "odd";
        }
    }
}
