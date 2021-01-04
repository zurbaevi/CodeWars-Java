package com.codewars.kyu8;

/**
 * @author Zurbaevi Nika
 */
public class MultiplicationTableForNumber {
    public static String multiTable(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            int result = i * num;
            sb.append(i).append(" * ").append(num).append(" = ").append(result).append("\n");
        }
        return sb.toString().trim();
    }
}
