package _02300

fun main()=print(Array(2){readln().toBigInteger()}.let{(a,b)->"${a+b}\n${a-b}\n${a*b}"})