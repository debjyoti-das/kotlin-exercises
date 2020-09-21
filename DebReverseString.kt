package com.debjyoti.reversestring

fun reverse(str: String): String {
    var reverse = ""

    for (i in str.length - 1 downTo 0) {
        reverse += str[i]
    }

    return reverse
}

fun main() {
    println("Enter a string: ")
    var str: String? = readLine()

    var reverse = str?.let { reverse(it) }
    println(reverse)
}