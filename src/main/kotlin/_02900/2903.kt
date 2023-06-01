package _02900

fun main()=print(readln().toInt().let{(1 shl it)+1}.let{it*it})