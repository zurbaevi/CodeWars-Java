package com.codewars.kyu8

/**
 * @author Zurbaevi Nika
 */
object ReverseWords {
    fun reverseWords(str: String): String = str.split(" ").reversed().joinToString(" ")
}
