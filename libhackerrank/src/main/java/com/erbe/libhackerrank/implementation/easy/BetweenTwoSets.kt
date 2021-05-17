package com.erbe.libhackerrank.implementation.easy

/*
 * Complete the 'getTotalX' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    // Write your code here
    var gcd = 0
    for (element in b) {
        gcd = findGCD(element, gcd)
    }
    var lcm: Int = a[0]
    for (i in 0 until a.size - 1) {
        lcm = (lcm * a[i + 1]) / findGCD(a[i + 1], lcm)
    }
    var count = 0
    var t = 0
    var i = 1
    while (i <= gcd && t < gcd) {
        t = lcm * i
        if (gcd % t == 0) {
            count++
        }
        i++
    }
    return count
}

fun findGCD(a: Int, b: Int): Int {
    return if (b == 0) a else findGCD(b, a % b)
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val brr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val total = getTotalX(arr, brr)

    println(total)
}