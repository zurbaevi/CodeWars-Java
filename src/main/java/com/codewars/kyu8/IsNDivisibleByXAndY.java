package com.codewars.kyu8;

/**
 * @author Zurbaevi Nika
 */
public class IsNDivisibleByXAndY {
    public static boolean isDivisible(long n, long x, long y) {
        return (n % x == 0) && (n % y == 0);
    }
}
