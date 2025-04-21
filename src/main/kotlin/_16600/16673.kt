package _16600

fun main()=print(readln().split(' ').map{it.toInt()}.let{(c,k,p)->c*(c+1)*(3*k+p*(2*c+1))/6})