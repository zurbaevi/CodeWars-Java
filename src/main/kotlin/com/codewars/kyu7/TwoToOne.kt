package com.codewars.kyu7

fun longest(s1: String, s2: String): String {
    val string = s1 + s2
    val builder = StringBuilder()
    var newString = ""
    val stringList: ArrayList<String> = arrayListOf()

    string.forEach {
        if (!stringList.contains(it.toString())) {
            stringList.add(it.toString())
            stringList.sort()
        }
    }

    stringList.forEach {
        builder.append(it)
    }

    newString = builder.toString()

    return newString
}
