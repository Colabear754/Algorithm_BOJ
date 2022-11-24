package _10400

fun main()=print(readln().split(" ").map{it.toInt()}.let{val a=(it[0]+it[1])%it[2];val b=(it[0]*it[1])%it[2];"$a\n$a\n$b\n$b"})