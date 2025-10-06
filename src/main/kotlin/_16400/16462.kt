package _16400

import kotlin.math.roundToInt
fun main()=print(DoubleArray(readln().toInt()){readln().replace('0','9').replace('6','9').toDouble().let{if(it>100) 100.0 else it } }.average().roundToInt())