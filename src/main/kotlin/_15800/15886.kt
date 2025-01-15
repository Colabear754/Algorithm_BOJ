package _15800

fun main()=print(readln().let{readln().replace("EW",".").count{it=='.'}})