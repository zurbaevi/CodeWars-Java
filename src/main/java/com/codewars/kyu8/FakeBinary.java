package com.codewars.kyu8;

/**
 * @author Nika Zurbaevi
 */
public class FakeBinary {
    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
}
