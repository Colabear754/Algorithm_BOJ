package _10800

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val str = readln()
    for (c in 'a'..'z') {
        sb.append("${str.indexOf(c)} ")
    }
    println(sb)
}