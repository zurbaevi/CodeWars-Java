package com.codewars.kyu8

/**
 * @author Zurbaevi Nika
 */
fun simpleMultiplication(n: Int): Int = if (n % 2 == 0) {
    n * 8
} else {
    n * 9
}
