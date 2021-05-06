package com.codewars.kyu8

object ReverseWords {
    fun reverseWords(str: String): String {
        return str.split(" ").reversed().joinToString(" ")
    }
}