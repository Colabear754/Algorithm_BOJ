package _18400

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toCharArray().map { it - '0' }
    val first = n.slice(0 until n.size / 2)
    val second = n.slice(n.size / 2..n.lastIndex)
    println(if (first.sum() == second.sum()) "LUCKY" else "READY")
}