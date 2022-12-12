package _02400

import kotlin.math.abs
fun main()=print(readln().split(' ').map{it.toLong()}.let{abs(it[0]-it[1])})