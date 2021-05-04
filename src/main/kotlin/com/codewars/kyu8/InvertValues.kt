package com.codewars.kyu8

fun invert(arr: IntArray): IntArray {
    for(i in arr.indices) {
        arr[i] *= -1;
    }
    return arr;
}