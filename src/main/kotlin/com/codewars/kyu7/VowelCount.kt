package com.codewars.kyu7

/**
 * @author Zurbaevi Nika
 */
fun getCount(str : String) : Int {
    return str.replace("[^aeiou]".toRegex(), "").length
}
