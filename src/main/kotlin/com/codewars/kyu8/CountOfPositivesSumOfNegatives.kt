package com.codewars.kyu8

/**
 * @author Zurbaevi Nika
 */
fun countPositivesSumNegatives(input: Array<Int>?): Array<Int> {
    if (input.isNullOrEmpty()) return emptyArray();

    var pos = 0
    var neg = 0

    for (i in input)
        if (i > 0) pos++
        else neg += i

    return arrayOf(pos, neg)
}