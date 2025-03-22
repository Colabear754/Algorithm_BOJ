package _16400

fun main()=print(List(2){readln()}.map{it.toDouble()}.let{2*it[0]+2*3.141592*it[1]})