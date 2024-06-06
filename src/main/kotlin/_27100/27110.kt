package _27100

fun main()=print(readln().toInt().let{n->readln().split(' ').map{it.toInt()}.sumOf{minOf(n,it)}})