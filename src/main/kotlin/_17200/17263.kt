package _17200

fun main()=print(readln().let{readln().split(' ').map{it.toInt()}.run{max()}})