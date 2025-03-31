package _25100

fun main()=print(readln().split(' ').map{it.toInt()}.let{(n,m,k)->((m+k-4)%n+n)%n+1})