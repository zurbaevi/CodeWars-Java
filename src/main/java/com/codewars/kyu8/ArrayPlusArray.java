package com.codewars.kyu8;

import java.util.Arrays;

/**
 * @author Nika Zurbaevi
 */
public class ArrayPlusArray {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return Arrays.stream(arr1).sum() + Arrays.stream(arr2).sum();
    }
}
