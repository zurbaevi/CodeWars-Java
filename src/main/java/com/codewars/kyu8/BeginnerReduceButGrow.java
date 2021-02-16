package com.codewars.kyu8;

/**
 * @author Zurbaevi Nika
 */
public class BeginnerReduceButGrow {
    public static int grow(int[] x){
        int temp = 1;
        for (int j : x) {
            temp = temp * j;
        }
        return temp;
    }
}
