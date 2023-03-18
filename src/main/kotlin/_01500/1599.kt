package _01500

import java.util.TreeMap

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    TreeMap<String, String>().also { map ->
        repeat(readLine().toInt()) {
            val str = readLine()
            map[str.toMinsik()] = str
        }
        map.forEach { bw.write("${it.value}\n") }
    }
    bw.close()
}

private fun String.toMinsik() = this.replace("ng", "L")
    .replace("a", "A")
    .replace("b", "B")
    .replace("k", "C")
    .replace("d", "D")
    .replace("e", "E")
    .replace("g", "F")
    .replace("h", "G")
    .replace("i", "H")
    .replace("l", "I")
    .replace("m", "J")
    .replace("n", "K")
    .replace("o", "M")
    .replace("p", "N")
    .replace("r", "O")
    .replace("s", "P")
    .replace("t", "Q")
    .replace("u", "R")
    .replace("w", "S")
    .replace("y", "T")