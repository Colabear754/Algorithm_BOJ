package _05500

fun main()=print(List(4){readln().toInt()}.sum().let{"${it/60}\n${it%60}"})