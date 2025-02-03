package _17300

import kotlin.math.pow
fun main()=print(readln().split(' ').map{it.toDouble()}.let{1/(1+10.0.pow((it[1]-it[0])/400))})