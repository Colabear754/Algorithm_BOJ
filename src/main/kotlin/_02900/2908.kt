package _02900

fun main()=print(readln().split(' ').map{it.reversed().toInt()}.let{maxOf(it[0],it[1])})