package _01200

import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    while (true) {
        val s = readln().lowercase()
        if (s == "#") {
            break
        }
        writer.write("${s.count { it in "aeiou" }}\n")
    }
    writer.flush()
    writer.close()
}