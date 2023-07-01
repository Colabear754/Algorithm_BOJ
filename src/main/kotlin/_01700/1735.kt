package _01700

fun main() = with(System.`in`.bufferedReader()) {
    val (a, b) = readLine().split(' ').map(String::toInt)
    val (c, d) = readLine().split(' ').map(String::toInt)
    val e = lcm(b, d)
    val f = a * (e / b) + c * (e / d)
    val g = gcd(e, f)
    println("${f / g} ${e / g}")
}

private fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
private fun lcm(a: Int, b: Int): Int = a * b / gcd(a, b)