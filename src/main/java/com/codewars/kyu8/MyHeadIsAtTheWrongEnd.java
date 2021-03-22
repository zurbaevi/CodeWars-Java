package com.codewars.kyu8;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author Zurbaevi Nika
 */
public class MyHeadIsAtTheWrongEnd {
    public static String[] fixTheMeerkat(String[] arr) {
        var collect = Arrays.asList(arr);
        Collections.reverse(collect);
        return collect.toArray(String[]::new);
    }
}
