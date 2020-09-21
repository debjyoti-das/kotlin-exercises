package com.debjyoti.armstrong

fun main() {
    print("Write any number: ")
    val number = Integer.valueOf(readLine())
    var origNumber: Int
    var remainder: Int
    var result = 0
    var x = 0
    origNumber = number

    while (origNumber != 0) {
        origNumber /= 10
        ++x
    }
    origNumber = number
    while (origNumber != 0) {
        remainder = origNumber % 10
        result += Math.pow(remainder.toDouble(), x.toDouble()).toInt()
        origNumber /= 10
    }

    if (result == number)
        println("$number is an Armstrong number.")
    else
        println("$number is not an Armstrong number.")
}