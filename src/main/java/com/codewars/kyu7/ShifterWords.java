package com.codewars.kyu7;

import java.util.HashSet;
import java.util.regex.Pattern;

public class ShifterWords {
    public static int count(String st) {
        Pattern pattern = Pattern.compile("[HINOSXZMW]+");
        HashSet<String> matches = new HashSet<>();
        for (String s : st.split(" ")) {
            if (pattern.matcher(s).matches()) {
                matches.add(s);
            }
        }
        return matches.size();
    }
}
