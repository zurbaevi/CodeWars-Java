package com.codewars.kyu7;

import java.util.List;

/**
 * @author Nika Zurbaevi
 */
public class OnesAndZeros {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int total = 0;
        int currentValue = 1;
        for (int index = binary.size() - 1; index >= 0; index--) {
            if (binary.get(index) == 1) {
                total += currentValue;
            }
            currentValue *= 2;
        }
        return total;
    }
}
