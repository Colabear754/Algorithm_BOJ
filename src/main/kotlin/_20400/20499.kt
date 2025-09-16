package _20400

fun main()=print(readln().split('/').map{it.toInt()}.let{if(it[0]+it[2]-it[1]<0||it[1]==0)"hasu" else "gosu"})