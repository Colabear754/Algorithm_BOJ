package _16400

fun main() = with(System.`in`.bufferedReader()) {
    val (a, b) = readLine().split(' ').map { it.toBigInteger() }
    val absB = b.abs()
    var r = a % absB
    var q = (a - r) / b
    if (r < 0.toBigInteger()) {
        r += absB
        q -= b.signum().toBigInteger()
    }
    println("$q $r")
}