package _05500

fun main()=print(readln().map{((it-'A'+23)%26+'A'.code).toChar()}.joinToString(""))