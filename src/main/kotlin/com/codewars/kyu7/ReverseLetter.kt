package com.codewars.kyu7

fun reverseLetter(str: String): String {
    return StringBuilder(str.replace("[^a-zA-Z]".toRegex(), "")).reverse().toString()
}