package _24000

private val i get()=readln().toInt()
fun main()=print(((i+i)%12).takeIf{it!=0}?:12)