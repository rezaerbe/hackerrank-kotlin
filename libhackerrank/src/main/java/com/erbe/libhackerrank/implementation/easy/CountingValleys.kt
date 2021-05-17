package com.erbe.libhackerrank.implementation.easy

/*
 * Complete the 'countingValleys' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER steps
 *  2. STRING path
 */

fun countingValleys(steps: Int, path: String): Int {
    // Write your code here
    var valley = 0
    var altitude = 0
    for (i in path) {
        if (i.toString() == "U") {
            altitude++
            if (altitude == 0) {
                valley++
            }
        } else {
            altitude--
        }
    }
    return valley
}

fun main(args: Array<String>) {
    val steps = readLine()!!.trim().toInt()

    val path = readLine()!!

    val result = countingValleys(steps, path)

    println(result)
}