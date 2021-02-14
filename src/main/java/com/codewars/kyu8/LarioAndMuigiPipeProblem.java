package com.codewars.kyu8;

/**
 * @author Zurbaevi Nika
 */
public class LarioAndMuigiPipeProblem {
    public static int[] pipeFix(int[] numbers) {
        int min = numbers[0];
        int max = numbers[numbers.length - 1];
        int[] result = new int[max - min + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = i + min;
        }
        return result;
    }
}
