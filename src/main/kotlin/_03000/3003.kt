package _03000

fun main()=print(readln().split(" ").map{it.toInt()}.let{val n=it;"${1-n[0]} ${1-n[1]} ${2-n[2]} ${2-n[3]} ${2-n[4]} ${8-n[5]}"})