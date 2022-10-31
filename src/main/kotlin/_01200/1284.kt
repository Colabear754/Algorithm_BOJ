package _01200

import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    var addr: String
    while (true) {
        addr = readln()
        if (addr == "0") {
            break
        }
        val w = 1 + addr.sumOf {
            0 + when (it) {
                '0' -> 5
                '1' -> 3
                else -> 4
            }
        }
        writer.write("$w\n")
    }
    writer.flush()
    writer.close()
}