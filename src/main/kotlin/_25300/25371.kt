package _25300

fun main()=print(readln().split(' ').map{it.toInt()}.let{(n,k)-> n.toString(k).split('0').sumOf{it.takeIf{!it.isEmpty()}?.toLong()?:0}.toString(k)})