package com.codewars.kyu6;

/**
 * @author Zurbaevi Nika
 */
public class DetectPangram {
    public boolean check(String str){
        for (char c = 'a'; c <= 'z'; c++) {
            if (!str.toLowerCase().contains("" + c)) {
                return false;
            }
        }
        return true;
    }
}
