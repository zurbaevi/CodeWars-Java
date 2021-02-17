package com.codewars.kyu8;

/**
 * @author Zurbaevi Nika
 */
public class BeginnerLostWithoutAMap {
    public static int[] map(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i] * 2;
        }
        return newArr;
    }
}
