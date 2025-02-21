package _24500

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toLong()
    val nBit = n.toString(2)
    val bitLength = nBit.length
    val max = (1L shl bitLength) - 1
    println(if (n == max) "1\n$n" else "2\n${max xor n}\n$n")
}