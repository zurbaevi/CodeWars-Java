package com.codewars.kyu7

/**
 * @author Zurbaevi Nika
 */
fun highAndLow(numbers: String) = numbers.split(' ').map(String::toInt).let { "${it.max()} ${it.min()}" }