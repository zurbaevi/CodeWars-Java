package com.codewars.kyu7;

/**
 * @author Zurbaevi Nika
 */
public class VowelCount {
    public static int getCount(String str) {
        int vowelsCount = 0;
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            if ("a,e,i,o,u".contains("" + str.charAt(i))) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
