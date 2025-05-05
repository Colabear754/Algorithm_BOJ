package _29700

fun main()=print(readln().split(' ').map{it.toDouble()}.let{"${it[0]*it[1]/2}".format("%.1f")})