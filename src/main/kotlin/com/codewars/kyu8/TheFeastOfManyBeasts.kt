package com.codewars.kyu8

/**
 * @author Zurbaevi Nika
 */
fun feast(beast: String, dish: String): Boolean {
    return beast.first() == dish.first() && beast.last() == dish.last()
}