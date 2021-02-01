package com.codewars.kyu6;

/**
 * @author Zurbaevi Nika
 */
public class BreakCamelCase {
    public static String camelCase(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }
}
