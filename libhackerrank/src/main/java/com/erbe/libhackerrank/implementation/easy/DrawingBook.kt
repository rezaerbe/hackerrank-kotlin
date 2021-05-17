package com.erbe.libhackerrank.implementation.easy

/*
 * Complete the 'pageCount' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER p
 */

fun pageCount(n: Int, p: Int): Int {
    // Write your code here
    val totalFromFront = n / 2
    val targetFromFront = p / 2
    val targetFromBack = totalFromFront - targetFromFront

    return Math.min(targetFromFront, targetFromBack)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val p = readLine()!!.trim().toInt()

    val result = pageCount(n, p)

    println(result)
}