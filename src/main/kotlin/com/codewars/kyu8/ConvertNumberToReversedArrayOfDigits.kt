package com.codewars.kyu8

fun digitize(n: Long): IntArray {
    return n.toString().reversed().map { it.toString().toInt() }.toIntArray()
}