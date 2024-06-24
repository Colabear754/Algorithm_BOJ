package _31800

fun main() = with(System.`in`.bufferedReader()) {
    val code = readLine().take(5)
    println(Array(readLine().toInt()) { readLine().take(5) }.count { it == code } )
}