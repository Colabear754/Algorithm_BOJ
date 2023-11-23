package _25100

fun main()=print(minOf(readln().toInt(),readln().split(' ').map{it.toInt()}.let{it[0]/2+it[1]}))