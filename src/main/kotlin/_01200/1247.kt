package _01200

import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.math.BigInteger

fun main() {
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    repeat(3) {
        val n = readln().toInt()
        var a = BigInteger("0")
        repeat(n) {
            a = a.plus(BigInteger(readln()))
        }
        val result = a.compareTo(BigInteger("0"))
        writer.write(if (result > 0) "+\n" else if (result < 0) "-\n" else "0\n")
    }
    writer.flush()
    writer.close()
}