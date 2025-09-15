package _02100

fun main()=print(readln().split(' ').map{it.toInt()}.let{(x,y)->x+y-gcd(x,y)})
private fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)