package _15700

fun main()=print(readln().toInt().let{it/5+if(it%5==0)0 else 1})