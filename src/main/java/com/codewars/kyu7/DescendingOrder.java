package com.codewars.kyu7;

import java.util.Arrays;

/**
 * @author Zurbaevi Nika
 */
public class DescendingOrder {
    public static int sortDesc(final int num) {
        String[] temp = String.valueOf(num).split("");
        Arrays.sort(temp);
        StringBuilder reverse = new StringBuilder();
        for(int i = temp.length -1; i >= 0; i--)
        {
            reverse.append(temp[i]);
        }
        return Integer.parseInt(reverse.toString());
    }
}
