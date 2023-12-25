package _02400

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val n = readLine().toInt()
    repeat(n) { sb.append("${" ".repeat(it)}${"*".repeat(n - it)}\n") }
    print(sb)
}