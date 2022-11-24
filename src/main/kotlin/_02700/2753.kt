package _02700

fun main()=print(readln().toInt().let{when{it%400==0->1;it%100==0->0;it%4==0->1;else->0}})