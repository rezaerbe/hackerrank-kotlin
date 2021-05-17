package com.erbe.libhackerrank.implementation.easy

/*
 * Complete the 'breakingRecords' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY scores as parameter.
 */

fun breakingRecords(scores: Array<Int>): Array<Int> {
    // Write your code here
    var high = scores[0]
    var low = scores[0]
    var best = 0
    var worst = 0
    for (i in 1 until scores.size) {
        if (scores[i] > high) {
            best++
            high = scores[i]
        } else if (scores[i] < low) {
            worst++
            low = scores[i]
        }
    }
    return arrayOf(best, worst)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val scores = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}