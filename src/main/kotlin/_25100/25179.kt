package _25100

fun main()=print(readln().split(' ').map{it.toLong()}.let{"Can${if(it[0]%(it[1]+1)==1L)"'t" else ""} win"})