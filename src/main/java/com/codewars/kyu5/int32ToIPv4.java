package com.codewars.kyu5;

/**
 * @author Nika Zurbaevi
 */
public class int32ToIPv4 {
    public static String longToIP(long ip) {
        return ((ip >> 24) & 0xff) + "." +
                ((ip >> 16) & 0xff) + "." +
                ((ip >> 8) & 0xff) + "." +
                (ip & 0xff);
    }
}
