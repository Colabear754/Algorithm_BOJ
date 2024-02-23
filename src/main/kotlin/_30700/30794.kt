package _30700

fun main()=print(readln().split(' ').let{it[0].toInt()*when(it[1]){"miss"->0;"bad"->200;"cool"->400;"great"->600;else->1000}})