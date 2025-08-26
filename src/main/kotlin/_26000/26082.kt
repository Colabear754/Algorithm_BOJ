package _26000

fun main()=print(readln().split(' ').map{it.toInt()}.let{(a,b,c)->b/a*c*3})