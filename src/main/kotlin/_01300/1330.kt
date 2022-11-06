package _01300

fun main()=println(readln().split(" ").map{it.toInt()}.let{when{it[0]>it[1]->'>';it[0]<it[1]->'<';else->"=="}})