package _15700

fun main()=print(readln().split(' ').map{it.toBigDecimal()}.let{it[0].divide(it[1],java.math.MathContext(1001))})