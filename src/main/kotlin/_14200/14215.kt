package _14200

fun main()=print(readln().split(' ').map(String::toInt).sorted().let{if(it[0]+it[1]>it[2])it.sum()else it[0]*2+it[1]*2-1})