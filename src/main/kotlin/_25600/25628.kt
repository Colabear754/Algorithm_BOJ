package _25600

fun main()=print(readln().split(' ').map{it.toInt()}.let{minOf(it[0]/2,it[1])})