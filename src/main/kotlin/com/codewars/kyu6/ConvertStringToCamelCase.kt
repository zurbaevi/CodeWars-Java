package com.codewars.kyu6

/**
 * @author Zurbaevi Nika
 */
fun toCamelCase(str: String): String =
    str.split("-", "_")
        .mapIndexed { index, word ->
            if (index != 0) word.capitalize() else word
        }.joinToString("")
