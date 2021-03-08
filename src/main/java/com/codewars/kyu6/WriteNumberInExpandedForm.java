package com.codewars.kyu6;

import java.util.ArrayList;

/**
 * @author Zurbaevi Nika
 */
public class WriteNumberInExpandedForm {
    public static String expandedForm(int num) {
        String stringNumber = Integer.toString(num);
        ArrayList<String> result = new ArrayList<>(stringNumber.length());
        for (int i = 0; i < stringNumber.length(); i++) {
            if (stringNumber.charAt(i) != '0') {
                int firstDigit = Character.getNumericValue(stringNumber.charAt(i));
                int numOfZeros = stringNumber.length() - 1 - i;
                int fullNum = firstDigit * (int) Math.pow(10, numOfZeros);
                result.add(String.valueOf(fullNum));
            }
        }
        return String.join(" + ", result);
    }
}
