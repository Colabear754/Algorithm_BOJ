package _05200

import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val music = StringTokenizer(readLine(), "|").run { Array(countTokens()) { nextToken() } }
    val scale = IntArray(7)
    music.forEach { scale[it[0] - 'A']++ }
    val aMinor = scale[0] + scale[3] + scale[4]
    val cMajor = scale[2] + scale[5] + scale[6]
    println(if (aMinor == cMajor) if (music.last().last() in charArrayOf('A', 'D', 'E')) "A-minor" else "C-major" else if (aMinor > cMajor) "A-minor" else "C-major")
}