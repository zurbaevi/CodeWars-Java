package com.codewars.kyu7;

/**
 * @author Nika Zurbaevi
 */
public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        String[] array = numbers.split(" ");
        String big = array[0];
        String small = array[0];
        for (String s : array) {
            if (Integer.parseInt(big) <= Integer.parseInt(s))
                big = s;
            else if (Integer.parseInt(small) >= Integer.parseInt(s))
                small = s;
        }
        return (big + " " + small);
    }
}
