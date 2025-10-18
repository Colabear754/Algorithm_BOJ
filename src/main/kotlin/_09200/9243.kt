package _09200

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val before = readLine().toBigInteger(2)
    val after = readLine().toBigInteger(2)
    println("Deletion ${if (if (n and 1 == 1) before xor after == (1.toBigInteger() shl before.bitLength()) - 1.toBigInteger() else before == after) "succeeded" else "failed"}")
}