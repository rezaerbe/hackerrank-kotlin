package com.erbe.libhackerrank.implementation.easy

// Complete the birthday function below.
fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    var i = 0
    var j = m
    val x = s.toList()
    var count = 0
    while (j <= s.size) {
        val total = x.subList(i, j).sum()
        if (total == d) {
            count++
        }
        i++
        j++
    }
    return count
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val dm = readLine()!!.trimEnd().split(" ")

    val d = dm[0].toInt()

    val m = dm[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}