package _11800

fun main()=print(readln().run{if(startsWith("0x"))substring(2).toInt(16)else if(first()=='0')substring(1).toInt(8)else this})