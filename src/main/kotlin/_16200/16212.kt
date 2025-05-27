package _16200

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    println(java.util.StringTokenizer(readLine()).run { IntArray(n) { nextToken().toInt() } }.apply { sort() }.joinToString(" "))
}