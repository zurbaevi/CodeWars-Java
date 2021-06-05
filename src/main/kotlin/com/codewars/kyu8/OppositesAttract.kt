package com.codewars.kyu8

/**
 * @author Zurbaevi Nika
 */
fun loveFun(flowerA: Int, flowerB: Int) = ((flowerA % 2 == 0) and (flowerB % 2 != 0)) or ((flowerA % 2 != 0) and (flowerB % 2 == 0))