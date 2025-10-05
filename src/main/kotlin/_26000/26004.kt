package _26000

fun main() = with(System.`in`.bufferedReader()) {
    val count = IntArray(26)
    readLine()
    readLine().forEach { count[it - 'A']++ }
    println(minOf(count[0], count[2], count[7], count[8], count[17]))
}