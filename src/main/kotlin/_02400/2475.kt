package _02400

import kotlin.math.pow
fun main()=print(readln().split(' ').sumOf{it.toDouble().pow(2)}.toInt()%10)