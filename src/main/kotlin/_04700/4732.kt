package _04700

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val scale = arrayOf("A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#")
    lateinit var input: String
    while (readLine().also { input = it } != "***") {
        val array = StringTokenizer(input).run { IntArray(countTokens()) { nextToken().position } }
        val n = readLine().toInt()
        array.forEach { bw.write("${scale[(it + 12 + n) % 12]} ") }
        bw.newLine()
    }
    bw.close()
}

private val String.position get() = when (this) {
    "A" -> 0
    "A#", "Bb" -> 1
    "B", "Cb" -> 2
    "C", "B#" -> 3
    "C#", "Db" -> 4
    "D" -> 5
    "D#", "Eb" -> 6
    "E", "Fb" -> 7
    "F", "E#" -> 8
    "F#", "Gb" -> 9
    "G" -> 10
    "G#", "Ab" -> 11
    else -> -1
}