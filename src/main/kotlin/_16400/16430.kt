package _16400

fun main()=print(readln().split(' ').map{it.toInt()}.let{(a,b)->"${b-a} $b"})