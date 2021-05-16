package com.erbe.libhackerrank.warmup

import java.util.*

// Complete the miniMaxSum function below.
fun miniMaxSum(arr: Array<Int>): Unit {
    val array = arr.map { it.toLong() }
    val max = array.max()
    val min = array.min()
    val sum = array.sum()
    println("${sum - max!!} ${sum - min!!}")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    miniMaxSum(arr)
}