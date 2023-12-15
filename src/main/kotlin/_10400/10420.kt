package _10400

import java.time.LocalDate
fun main()=println(LocalDate.of(2014,4,2).plusDays(readln().toLong()-1))