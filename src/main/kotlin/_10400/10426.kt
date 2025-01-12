package _10400

fun main()=print(readln().split(' ').let{java.time.LocalDate.parse(it[0]).plusDays(it[1].toLong()-1)})