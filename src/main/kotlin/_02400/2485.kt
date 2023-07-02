package _02400

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val colonnade = IntArray(n) { readLine().toInt() }
    val distance = IntArray(n - 1) { colonnade[it + 1] - colonnade[it] }
    val gcd = distance.reduce { acc, i -> gcd(acc, i) }
    var result = 0
    for (d in distance) result += d / gcd - 1
    println(result)
}

private fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)