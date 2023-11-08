package _01800

fun main() = with(System.`in`.bufferedReader()) {
    val (a, b) = readLine().split(' ').map { it.toLong() }
    val gcd = gcd(a, b)
    println("1".repeat(gcd.toInt()))
}

private fun gcd(a: Long, b: Long): Long = if (b == 0L) a else gcd(b, a % b)