package _32200

fun main()=print(readln().split(' ').map{it.toLong()}.let{(n,m)->m*(n-1)+n*(m-1)+(n-1)*(m-1)*2})