package _29700

fun main()=print(readln().split(' ').map{it.toInt()}.let{(a,b,c)->if(a>=1000&&(b>=8000||c>=260))"Very Good" else if(a>=1000)"Good" else "Bad"})