package com.erbe.libhackerrank.warmup

// Complete the compareTriplets function below.
fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var c = 0
    var d = 0
    for (i in 0..2) {
        if (a[i] > b[i]) {
            c++
        } else if (a[i] < b[i]) {
            d++
        }
    }
    return arrayOf(c, d)
}

fun main(args: Array<String>) {
    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}