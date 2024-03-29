package _28000

fun main()=print(readln().let{s->if("MOBIS".toCharArray().all{it in s})"YES" else "NO"})