package com.debjyoti.wordcount

fun main(args: Array<String>) {
    println("Enter some text: ")
    val inputText = readLine()

    val map = inputText?.replace("[^a-zA-Z]+".toRegex(), " ") 
        ?.trim()
        ?.toLowerCase()
        ?.split(" ")
        ?.groupingBy { it }
        ?.eachCount()

    println(map)
}