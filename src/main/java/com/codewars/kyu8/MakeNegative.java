package com.codewars.kyu8;

/**
 * @author Nika Zurbaevi
 */
public class MakeNegative {
    public static int makeNegative(final int x) {
        return (x <= 0) ? x : ~x + 1;
    }
}
