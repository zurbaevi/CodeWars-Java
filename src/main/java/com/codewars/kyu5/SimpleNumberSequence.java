package com.codewars.kyu5;

import java.util.ArrayList;

/**
 * @author Zurbaevi Nika
 */
public class SimpleNumberSequence {
    public static int missing(String s) {
        for (int i = 1; i < 10; i++) {
            var missingNumberList = new ArrayList<Integer>();
            var length = i;
            var value = Integer.parseInt(s.substring(0, i));
            for (int j = i; j + length <= s.length(); ) {
                length = String.valueOf(++value).length();
                if (value != Integer.parseInt(s.substring(j, j + length))) {
                    missingNumberList.add(value);
                    if (missingNumberList.size() > 2) {
                        break;
                    }
                } else {
                    j += length;
                }
            }
            if (missingNumberList.size() == 1) {
                return missingNumberList.get(0);
            }
        }
        return -1;
    }
}
