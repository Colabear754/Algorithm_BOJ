package _01100

fun main()=print(readln().split(' ').map{it.toInt()}.let{(n,m)->m-gcd(n,m)})
private fun gcd(a:Int,b:Int):Int=if(b==0)a else gcd(b,a%b)