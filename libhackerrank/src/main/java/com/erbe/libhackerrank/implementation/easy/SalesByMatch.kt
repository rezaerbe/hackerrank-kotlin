package com.erbe.libhackerrank.implementation.easy

/*
 * Complete the 'sockMerchant' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER_ARRAY ar
 */

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    // Write your code here
    val group = ar.groupingBy { it }.eachCount()
    return group.filter { it.value >= 2 }.map { it.value / 2 }.sum()
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}