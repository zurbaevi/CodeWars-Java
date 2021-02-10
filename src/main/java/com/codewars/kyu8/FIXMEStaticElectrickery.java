package com.codewars.kyu8;

/**
 * @author Zurbaevi Nika
 */
public class FIXMEStaticElectrickery {
    static final FIXMEStaticElectrickery INST = new FIXMEStaticElectrickery();
    private static int ONE_HUNDRED = 100;
    private final int value;

    private FIXMEStaticElectrickery() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }
}
