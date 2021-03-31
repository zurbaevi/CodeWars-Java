package com.codewars.kyu7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Zurbaevi Nika
 */
public class FIXME1234 {
    private static final Map<String, MyNumber> cache = new HashMap<>();

    static MyNumber getNumber(final String name) {
        return List.of(MyNumber.values()).get(("_oneichiun____twonideux____threesantroisfourshiquatre").indexOf(name) / 13);
    }

    enum MyNumber {
        ONE(1, "one", "ichi", "un"),
        TWO(2, "two", "ni", "deux"),
        THREE(3, "three", "san", "trois"),
        FOUR(4, "four", "shi", "quatre");

        private final int val;

        MyNumber(int val, String... names) {
            this.val = val;
            for (final String n : names) cache.put(n, this);
        }

        public int intValue() {
            return this.val;
        }
    }
}
