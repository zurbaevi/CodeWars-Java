package com.codewars.kyu7;

/**
 * @author Zurbaevi Nika
 */
public class SimpleLetterRemoval {
    public static String solve(String s, int k) {
        for (int c : s.chars().sorted().limit(k).toArray()) {
            s = s.replaceFirst((char) c + "", "");
        }
        return s;
    }
}
