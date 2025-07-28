package _27900

fun main()=print(readln().split(' ').map{it.toInt()}.let{if(it[0]*100>=it[1])"Yes" else "No"})