package _19900

fun main()=print(readln().split(' ').map{it.toInt()}.let{(n,m)->if(m in 1..2)"NEWBIE!" else if(m<=n)"OLDBIE!" else "TLE!"})