package com.codewars.kyu7;

/**
 * @author Zurbaevi Nika
 */
public class LetterboxPaintSquad {
    public static int[] paintLetterboxes(final int start, final int end) {
        int[] index = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int tmp;
        for (int i = start; i <= end; i++) {
            tmp = i;
            while (tmp != 0) {
                index[tmp % 10] += 1;
                tmp /= 10;
            }
        }
        return index;
    }
}
