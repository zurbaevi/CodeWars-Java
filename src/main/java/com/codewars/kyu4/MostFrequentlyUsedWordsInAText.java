package com.codewars.kyu4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Zurbaevi Nika
 */
public class MostFrequentlyUsedWordsInAText {
    public static final int LIMIT = 3;

    public static List<String> top3(String string) {
        final Map<String, Integer> wordsCount = new HashMap<>();
        Pattern pattern = Pattern.compile("[A-Za-z][A-Za-z']*");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            String s = matcher.group().toLowerCase();
            wordsCount.put(s, wordsCount.getOrDefault(s, 1) + 1);
        }
        List<Map.Entry<String, Integer>> topWords = new ArrayList<>(wordsCount.entrySet());
        topWords.sort(Map.Entry.comparingByValue());
        ArrayList<String> result = new ArrayList<>();
        int j = 0;
        for (int i = topWords.size() - 1; i >= 0; i--) {
            String s = topWords.get(i).getKey();
            if (j > 2 || s == null || s.length() == 0) {
                break;
            }
            if (Character.isAlphabetic(s.charAt(0))) {
                result.add(j, topWords.get(i).getKey());
                j++;
            }
        }
        result.trimToSize();
        return result;
    }
}
