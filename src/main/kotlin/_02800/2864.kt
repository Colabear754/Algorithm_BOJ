package _02800

fun main()=print(readln().run{"${replace('6','5').split(' ').sumOf{it.toInt()}} ${replace('5','6').split(' ').sumOf{it.toInt()}}"})