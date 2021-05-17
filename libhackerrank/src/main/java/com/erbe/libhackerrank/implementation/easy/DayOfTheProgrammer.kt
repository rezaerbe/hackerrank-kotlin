package com.erbe.libhackerrank.implementation.easy

/*
 * Complete the 'dayOfProgrammer' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts INTEGER year as parameter.
 */

fun dayOfProgrammer(year: Int): String {
    // Write your code here
    var date = ""
    when {
        year < 1918 -> {
            date += if (year % 4 == 0) "12.09.$year" else "13.09.$year"
        }
        year == 1918 -> {
            date += "26.09.$year"
        }
        else -> {
            date += if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) "12.09.$year" else "13.09.$year"
        }
    }
    return date
}

fun main(args: Array<String>) {
    val year = readLine()!!.trim().toInt()

    val result = dayOfProgrammer(year)

    println(result)
}