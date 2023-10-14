package _25200

fun main()=print(readln().split(' ').map{it.toInt()}.let{it[0]*(100-it[1])/100}.let{if(it<100)1 else 0})