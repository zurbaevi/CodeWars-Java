package com.codewars.kyu8;

/**
 * @author Zurbaevi Nika
 */
public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        return String.valueOf(string).repeat(Math.max(0, repeat));
    }
}
