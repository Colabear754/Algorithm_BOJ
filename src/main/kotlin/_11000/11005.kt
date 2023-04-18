package _11000

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    var (n, b) = readLine().split(' ').map { it.toInt() }
    while (n >= b) {
        val mod = n % b
        sb.append(if (mod < 10) mod else (mod - 10 + 'A'.code).toChar())
        n /= b
    }
    sb.append(if (n < 10) n else (n - 10 + 'A'.code).toChar())
    println(sb.reverse())
}