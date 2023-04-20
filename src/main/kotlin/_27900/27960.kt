package _27900

fun main()=print(readln().split(' ').map{it.toInt()}.let{it[0]xor it[1]})