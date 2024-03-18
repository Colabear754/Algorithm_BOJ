package _27200

fun main()=print(readln().split(' ').let{if(it[0]in "12".."16"&&it[1]=="0")"320" else "280"})