package com.codewars.kyu8

/**
 * @author Zurbaevi Nika
 */
fun century(number: Int): Int {
    return if (number % 100 == 0) number / 100 else number / 100 + 1
}