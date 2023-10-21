package _02900

fun main()=print(readln().split(' ').map{it.toInt()}.let{(a,b)->a*(b-1)+1})