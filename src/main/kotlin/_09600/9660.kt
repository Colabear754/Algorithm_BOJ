package _09600

fun main()=print((readln().toLong()%7).let{if(it or 2==2L)"CY" else "SK"})