package _24500

fun main() = with(System.`in`.bufferedReader()) {
    var max = 0
    repeat(readLine().toInt()) { max = maxOf(max, readLine().replace("for", "*").replace("while", "*").count { it == '*' }) }
    println(max)
}