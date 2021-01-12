package com.codewars.kyu5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Nika Zurbaevi
 */
public class SortOneThreeTwo {

    public static class DingleMouse {

        public static int[] sort(final int[] array) {
            List<NumberAsText> list = new ArrayList<>();
            for (int n : array) {
                list.add(new NumberAsText(n));
            }
            list.sort(Comparator.comparing(NumberAsText::getText));
            return Arrays.stream(list.toArray(new NumberAsText[0])).mapToInt(NumberAsText::getNumber).toArray();
        }
    }

    static class NumberAsText {

        private static final String[] FIRST_19 = {"", " one", " two", " three",
                " four", " five", " six", " seven", " eight", " nine", " ten",
                " eleven", " twelve", " thirteen", " fourteen", " fifteen",
                " sixteen", " seventeen", " eighteen", " nineteen"};

        private static final String[] TEN_NAME = {"", " ten", " twenty",
                " thirty", " forty", " fifty", " sixty", " seventy", " eighty",
                " ninety"};
        private final int number;
        private final String text;

        NumberAsText(int number) {
            this.number = number;
            if (number == 0) text = "zero";
            else {
                String ntext = "";
                if (number / 100 > 0) {
                    ntext += FIRST_19[number / 100] + " hundred";
                }
                number %= 100;
                if (number <= 19) ntext += FIRST_19[number];
                else {
                    ntext += TEN_NAME[number / 10];
                    ntext += FIRST_19[number % 10];
                }
                text = ntext.trim();
            }
        }

        String getText() {
            return text;
        }

        int getNumber() {
            return number;
        }
    }
}
