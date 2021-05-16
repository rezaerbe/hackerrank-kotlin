package com.erbe.libhackerrank.warmup

import java.util.*

/*
 * Complete the timeConversion function below.
 */
fun timeConversion(s: String): String {
    /*
     * Write your code here.
     */
    val time = s.split(":")
    var hour = time[0]
    val minute = time[1]
    val second = time[2].substring(0, 2)
    val clock = time[2].substring(2, 4)
    if (clock == "AM" && hour == "12") {
        hour = "00"
    } else if (clock == "PM" && hour != "12") {
        hour = (hour.toInt() + 12).toString()
    }
    return "$hour:$minute:$second"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}