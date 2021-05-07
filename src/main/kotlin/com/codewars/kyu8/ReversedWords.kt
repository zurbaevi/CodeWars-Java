package com.codewars.kyu8

/**
 * @author Zurbaevi Nika
 */
object ReverseWords {
    fun reverseWords(str: String): String {
        return str.split(" ").reversed().joinToString(" ")
    }
}