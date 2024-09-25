package _32300

fun main()=print(Array(readln().toInt()){readln()}.filter{it==it.reversed()}.size.let{it*(it-1)})