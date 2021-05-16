package com.erbe.libhackerrank.warmup

import java.util.*

// Complete the staircase function below.
fun staircase(n: Int): Unit {
    val m = n - 1
    for (i in 0..m) {
        for (j in 0..m) {
            if (i + j > m - 1) {
                print("#")
            } else {
                print(" ")
            }
        }
        println()
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    staircase(n)
}