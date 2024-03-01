package _23000

fun main() = with(System.`in`.bufferedReader()) {
    val s = readLine()
    println(
        if (s.contains('A')) s.replace("[BCDF]".toRegex(), "A")
        else if (s.contains('B')) s.replace("[CDF]".toRegex(), "B")
        else if (s.contains('C')) s.replace("[DF]".toRegex(), "C")
        else "A".repeat(s.length)
    )
}