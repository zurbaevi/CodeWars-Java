package com.codewars.kyu6;

import java.util.Arrays;

/**
 * @author Nika Zurbaevi
 */
public class AreTheyTheSame {
    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null) return false;
        if (a.length != b.length) return false;
        int[] sortedA = Arrays.stream(a).map(x -> x * x).sorted().toArray();
        int[] sortedB = Arrays.stream(b).sorted().toArray();
        return Arrays.equals(sortedA, sortedB);
    }
}
