package com.codewars.kyu8

/**
 * @author Zurbaevi Nika
 */
fun twiceAsOld(dadYearsOld: Int, sonYearsOld: Int): Int {
    if ((dadYearsOld / 2) < sonYearsOld) {
        return sonYearsOld * 2 - dadYearsOld;
    }
    if (sonYearsOld == 0) {
        return dadYearsOld;
    }
    return dadYearsOld - sonYearsOld * 2;
}