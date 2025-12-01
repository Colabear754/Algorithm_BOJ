package _34600

fun main()=print(readln().split(' ').map{it.toInt()}.let{if(it[1]*100>=it[0]*81)"yaho" else "no"})