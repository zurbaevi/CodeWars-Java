package com.codewars.kyu7;

/**
 * @author Zurbaevi Nika
 */
public class ReverseANumber {
    public static int reverse(int number) {
        int output = 0;

        while (number != 0) {
            output = output * 10 + number % 10;
            number /= 10;
        }
        return output;
    }
}
