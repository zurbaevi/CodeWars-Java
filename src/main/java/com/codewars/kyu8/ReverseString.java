package com.codewars.kyu8;

/**
 * @author Zurbaevi Nika
 */
public class ReverseString {
    public static String solution(String str) {
        byte[] strAsByteArray = str.getBytes();
        byte[] result = new byte[strAsByteArray.length];
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        return new String(result);
    }
}
