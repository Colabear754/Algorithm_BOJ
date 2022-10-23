package _01000

import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
    val n = readln().toInt()
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    for (i in 0 until n) {
        var (a, b) = readln().split(" ").map { it.toInt() }
        var result = a
        if (a % 10 == 1 || a % 10 == 5 || a % 10 == 6) {
            writer.write("${a % 10}\n")
        } else {
            b = b % 4 + 4
            for (j in 2 .. b) {
                result = (result * a) % 10
            }

            if (result % 10 == 0) {
                result = 10
            }

            writer.write("${result}\n")
        }
    }
    writer.flush()
    writer.close()
}