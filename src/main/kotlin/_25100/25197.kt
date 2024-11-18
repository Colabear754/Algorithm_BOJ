package _25100

fun main()=print(readln().split(' ').map{it.toDouble()}.let{(n,k)->n*(n-1)/2/k})