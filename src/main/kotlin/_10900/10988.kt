package _10900

fun main() = with(System.`in`.bufferedReader()) {
    val s = readLine()
    for (i in 0 until s.length / 2) {
        if (s[i] != s[s.length - 1 - i]) {
            println(0)
            return@with
        }
    }
    println(1)
}