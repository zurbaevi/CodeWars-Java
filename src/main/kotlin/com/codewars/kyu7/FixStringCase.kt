package com.codewars.kyu7

/**
 * @author Zurbaevi Nika
 */
fun solve(s: String): String = if (s.count { it.isLowerCase() } >= s.length/2.0) s.toLowerCase() else s.toUpperCase()