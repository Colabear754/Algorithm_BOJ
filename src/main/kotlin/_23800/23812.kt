package _23800

fun main() = with(StringBuilder()) {
    val n = readln().toInt()
    for (i in 1..5) {
        repeat(n) {
            if (i and 1 == 1) append("@".repeat(n)).append(" ".repeat(3 * n)).append("@".repeat(n))
            else append("@".repeat(5 * n))
            appendLine()
        }
    }
    print(this)
}