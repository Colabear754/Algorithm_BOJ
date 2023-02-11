package _27300

fun main()=print(readln().let{it.length+2+it.count{c->c=='_'}*5})