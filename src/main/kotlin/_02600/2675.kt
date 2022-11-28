package _02600

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val c = readLine().toInt()
    repeat(c) {
        val (n, str) = readLine().split(" ")
        for (ch in str) {
            repeat(n.toInt()) {
                sb.append(c)
            }
        }
        sb.append('\n')
    }
    println(sb)
}