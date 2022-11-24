package _10800

fun main()=print(readln().split(" ").map{it.toInt()}.let{"${it[0]+it[1]}\n${it[0]-it[1]}\n${it[0]*it[1]}\n${it[0]/it[1]}\n${it[0]%it[1]}"})