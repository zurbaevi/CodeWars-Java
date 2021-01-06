package com.codewars.kyu6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Zurbaevi Nika
 */
public class FindTheOddInt {
    public static int findIt(int[] a) {
        Map<Integer, Integer> counterMap = new HashMap<>();
        for (int n : a) {
            if (counterMap.containsKey(n)) {
                counterMap.remove(n);
            } else if (!counterMap.containsKey(n)) {
                counterMap.put(n, 1);
            }
        }
        return new ArrayList<>(counterMap.keySet()).get(0);
    }
}
