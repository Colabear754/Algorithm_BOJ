package _12900

fun main()=print(readln().split(' ').map{it.toInt()}.let{(r,g,b)->(r+g+b)/3+if(r%3==g%3&&g%3==b%3)0 else 1})