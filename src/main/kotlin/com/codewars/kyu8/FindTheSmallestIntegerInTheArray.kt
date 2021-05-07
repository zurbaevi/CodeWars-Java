package com.codewars.kyu8

/**
 * @author Zurbaevi Nika
 */
fun findSmallestInt(nums: List<Int>): Int {
    return nums.min()?.toInt() ?: 0
}