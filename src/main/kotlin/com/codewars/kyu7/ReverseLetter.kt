package com.codewars.kyu7

fun reverseLetter(str: String): String = StringBuilder(str.replace("[^a-zA-Z]".toRegex(), "")).reverse().toString()
