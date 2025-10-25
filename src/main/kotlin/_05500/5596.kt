package _05500

fun main()=print(List(2){readln().split(' ').map{it.toInt()}.sum()}.max())