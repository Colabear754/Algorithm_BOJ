package _03000

fun main()=print(readln().toInt().let{(it/2+1)*(it/2+1)+if(it%2==0)0 else it/2+1})