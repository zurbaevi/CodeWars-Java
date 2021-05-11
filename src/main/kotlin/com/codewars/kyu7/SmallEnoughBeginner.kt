package com.codewars.kyu7

/**
 * @author Zurbaevi Nika
 */
fun smallEnough(a: IntArray, limit: Int): Boolean {
    return limit >= a.max()!!
}
