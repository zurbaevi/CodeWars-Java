package com.codewars.kyu7;

/**
 * @author Zurbaevi Nika
 */
public class Summy {
    static long summy(String stringOfInts) {
        String[] strings = stringOfInts.split(" ");
        long sum = 0;
        for (String string : strings) {
            sum += Integer.parseInt(string);
        }
        return sum;
    }
}
