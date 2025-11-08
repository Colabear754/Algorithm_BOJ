package _34500

fun main() = with(System.`in`.bufferedReader()) {
    val d = readLine().toInt()
    println(lcm(d, 360) / d)
}

private fun gcd(a: Int, b: Int): Int  = if (b == 0) a else gcd(b, a % b)
private fun lcm(a: Int, b: Int): Int = a / gcd(a, b) * b