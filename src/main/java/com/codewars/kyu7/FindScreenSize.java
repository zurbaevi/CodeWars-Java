package com.codewars.kyu7;

import java.util.Arrays;
import java.util.List;

/**
 * @author Zurbaevi Nika
 */
public class FindScreenSize {
    public static String findScreenHeight(int width, String ratio) {
        String[] widthNHeight = ratio.split(":");
        List<String> dim = Arrays.asList(widthNHeight);
        double w = Integer.parseInt(dim.get(0));
        double h = Integer.parseInt(dim.get(1));
        double r = width / w;
        double x = r * h;
        return width + "x" + (int) Math.floor(x);
    }
}
