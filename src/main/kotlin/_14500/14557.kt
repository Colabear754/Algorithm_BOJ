package _14500

fun main()=print(readln().split(' ').map{it.toInt()}.let{it[0]*it[1]}.let{"${it/2} ${it-1}"})