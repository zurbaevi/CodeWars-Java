package com.codewars.kyu6;

/**
 * @author Zurbaevi Nika
 */
public class GiveMeADiamond {
    public static String print(int n) {
        if (n < 0 || n % 2 == 0) {
            return null;
        }
        StringBuilder diamond = new StringBuilder();
        String asteriskRow;
        String paddingRow;

        for (int i = 0; i < n; i++) {
            if (i <= n / 2) {
                asteriskRow = "*".repeat(i * 2 + 1);
            } else {
                asteriskRow = "*".repeat((n - i) * 2 - 1);
            }
            paddingRow = " ".repeat((n - asteriskRow.length()) / 2);
            diamond.append(paddingRow).append(asteriskRow).append('\n');
        }
        return diamond.toString();
    }
}
