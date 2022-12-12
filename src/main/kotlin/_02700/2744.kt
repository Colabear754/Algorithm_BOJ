package _02700

fun main()=print(readln().map{if(it.isUpperCase())it.lowercase()else it.uppercase()}.joinToString(""))