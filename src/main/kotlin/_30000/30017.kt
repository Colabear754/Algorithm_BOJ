package _30000

fun main()=print(readln().split(' ').map{it.toInt()}.let{(a,b)->if(a>b)b*2+1 else a*2-1})