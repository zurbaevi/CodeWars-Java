package com.codewars.kyu5;

/**
 * @author Nika Zurbaevi
 */
public class CountIPAddresses {
    public static long ipsBetween(String start, String end) {
        String[] ipStr1 = start.split("\\.");
        String[] ipStr2 = end.split("\\.");
        int score = 0;
        for (int i = 0; i < 4; i++) {
            int ip = Integer.parseInt(ipStr1[i]);
            ip -= Integer.parseInt(ipStr2[i]);
            score = score * 256 + ip;
        }
        return score < 0 ? -score : score;
    }
}
