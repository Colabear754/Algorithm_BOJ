package _02300

fun main()=print(readln().split(' ').map{it.toLong()}.sorted().let{(a,b)->(a+b)*(b-a+1)/2})