package com.codewars.kyu6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.*;

/**
 * @author Nika Zurbaevi
 */
public class MostFrequentWeekdays {
    public static String[] mostFrequentDays(int year) {
        int mostFrequent = 0;
        var dateCursor = LocalDate.of(year, 1, 1);
        var firstDayNextYear = LocalDate.of(year + 1, 1, 1);

        var daysOfWeekInYear = new ArrayList<>();
        var frequencyMap = new HashMap<String, Integer>();
        var mostFrequentDays = new ArrayList<String>();

        while (dateCursor.isBefore(firstDayNextYear)) {
            var x = dateCursor.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
            daysOfWeekInYear.add(x);
            dateCursor = dateCursor.plusDays(1);
        }
        for (DayOfWeek day : DayOfWeek.values()) {
            var x = day.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
            frequencyMap.put(x, Collections.frequency(daysOfWeekInYear, x));
        }
        for (Integer val : frequencyMap.values()) {
            mostFrequent = Math.max(mostFrequent, val);
        }
        for (var e : frequencyMap.entrySet()) {
            if (mostFrequent == e.getValue())
                mostFrequentDays.add(e.getKey());
        }
        return Arrays.stream(DayOfWeek.values())
                .map(x -> x.getDisplayName(TextStyle.FULL, Locale.ENGLISH))
                .filter(mostFrequentDays::contains)
                .toArray(String[]::new);
    }
}
