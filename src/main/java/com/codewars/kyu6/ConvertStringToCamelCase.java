package com.codewars.kyu6;

/**
 * @author Zurbaevi Nika
 */
public class ConvertStringToCamelCase {
    static String toCamelCase(String s) {
        String[] words = s.split("-|_");
        for (int i = 1; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
        }
        return String.join("", words);
    }
}
