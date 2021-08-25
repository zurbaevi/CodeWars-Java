package com.codewars.kyu7

/**
 * @author Zurbaevi Nika
 */
fun evenNumbers(array: List<Int>, number: Int): List<Int> = array.filter { it % 2 == 0 }.takeLast(number)
