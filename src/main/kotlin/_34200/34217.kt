package _34200

fun main()=print(List(2){readln().split(' ').map{it.toInt()}}.run{if(sumOf{it[0]}<sumOf{it[1]})"Hanyang Univ." else if(sumOf{it[0]}>sumOf{it[1]})"Yongdap" else "Either"})