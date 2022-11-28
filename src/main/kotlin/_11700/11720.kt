package _11700

fun main() = with(System.`in`.bufferedReader()) {
    readLine()
    println(readLine().sumOf { it - '0' })
}