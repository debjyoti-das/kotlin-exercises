package com.debjyoti.checksublist

fun main (args: Array<String>){
    val list1 = listOf<Int>(1,2,3,4,5)
    val list2 = listOf<Int>(4,5)
    checkSubList(list1, list2, 0, list2.size)
}

fun checkSubList(list1: List<Int>,list2: List<Int>,start : Int , end :Int ) {

    val new = list1.subList(start, end)
    if (new == list2)
        println("B is subset of A")
    else if(end==list1.size)
        println("B is not a subset of A")
    else
        checkSubList(list1, list2, start+1, end+1)
}