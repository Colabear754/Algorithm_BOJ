package _02500

fun main()=print(IntArray(5){readln().toInt()}.sorted().let{"${it.sum()/5}\n${it[2]}"})