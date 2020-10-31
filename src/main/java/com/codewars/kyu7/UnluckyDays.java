package com.codewars.kyu7;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class UnluckyDays {
    public static int unluckyDays(int year) {
        int unlucky = 0;
        for (int m = 1; m <= 12; m++) {
            unlucky += LocalDate.of(year, m, 13).getDayOfWeek() == DayOfWeek.FRIDAY ? 1 : 0;
        }
        return unlucky;
    }
}
