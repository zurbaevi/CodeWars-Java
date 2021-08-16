package com.codewars.kyu7

/**
 * @author Zurbaevi Nika
 */
fun findShort(s: String): Int {
    return s.split(" ")
        .map { word -> word.length }
        .min()!!
}