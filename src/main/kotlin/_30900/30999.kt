package _30900

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(' ').map { it.toInt() }
    var result = 0
    val need = m / 2
    repeat(n) { if (readLine().count { it == 'O' } > need) result++ }
    println(result)
}