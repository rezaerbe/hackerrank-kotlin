package com.erbe.libhackerrank.warmup

import java.util.*

// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>): Unit {
    var a = 0
    var b = 0
    var c = 0
    val n = arr.size
    for (i in 0 until n) {
        when {
            arr[i] > 0 -> a++
            arr[i] < 0 -> b++
            else -> c++
        }
    }
    println("%.6f".format(a * 1.0 / n))
    println("%.6f".format(b * 1.0 / n))
    println("%.6f".format(c * 1.0 / n))
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}