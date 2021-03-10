package com.codewars.kyu8;

/**
 * @author Zurbaevi Nika
 */
public class StringyStrings {
    public static String stringy(int size) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                temp.append("1");
            } else {
                temp.append("0");
            }
        }
        return temp.toString();
    }
}
