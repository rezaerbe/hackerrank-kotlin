package com.erbe.libhackerrank.warmup

import kotlin.math.abs

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    val n = arr.size - 1
    var c = 0
    var d = 0
    for (i in 0..n) {
        for (j in 0..n) {
            if (i == j) {
                c += arr[i][j]
            }
            if (i + j == n) {
                d += arr[i][j]
            }
        }
    }
    return abs(c - d)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}