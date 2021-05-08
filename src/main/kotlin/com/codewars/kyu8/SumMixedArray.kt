package com.codewars.kyu8

/**
 * @author Zurbaevi Nika
 */
public fun sum(mixed: List<Any>): Int {
    var i = 0
    for (m in mixed) {
        when (m) {
            is Int -> i += m
            is String -> i += m.toInt()
        }
    }
    return i;
}