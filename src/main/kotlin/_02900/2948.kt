package _02900

fun main()=print(readln().split(' ').map{it.toInt()}.let{"${java.time.LocalDate.of(2009,it[1],it[0]).dayOfWeek}".lowercase().replaceFirstChar(Char::titlecase)})