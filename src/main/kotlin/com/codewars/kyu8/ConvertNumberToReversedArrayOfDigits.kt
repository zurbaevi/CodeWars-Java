package com.codewars.kyu8

/**
 * @author Zurbaevi Nika
 */
fun digitize(n: Long): IntArray {
    return n.toString().reversed().map { it.toString().toInt() }.toIntArray()
}