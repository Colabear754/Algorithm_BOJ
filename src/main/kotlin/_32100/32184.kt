package _32100

fun main()=print(readln().split(' ').map{it.toInt()}.let{(a,b)->(b-a)/2+1+(((a+1)and 1)and(b and 1))})